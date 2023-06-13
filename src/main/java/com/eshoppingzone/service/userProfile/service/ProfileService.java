package com.eshoppingzone.service.userProfile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eshoppingzone.entity.userProfile.entity.UserProfile;

@Service
public interface ProfileService {
    UserProfile addNewCustomerProfile(UserProfile userProfile);

    List<UserProfile> getAllProfile();

    Optional<UserProfile> getByProfileId(int id);

    void updateProfile(UserProfile userProfile);

    void deleteProfile(int id);

    void addNewMerchantProfile(UserProfile userProfile);

    void addDeliveryProfile(UserProfile userProfile);

    UserProfile findByMobileNumber(long mobileNumber);

    UserProfile getByUserName(UserProfile userDTO);
}














