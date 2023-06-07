

package com.eshoppingzone.dao.userProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshoppingzone.entity.userProfile.entity.UserProfile;

@Repository
public interface ProfileRepository extends JpaRepository<UserProfile, Long> {

    UserProfile findAllByMobileNumber(long mobileNumber);

    UserProfile findByFullName(String userName);
    
}
