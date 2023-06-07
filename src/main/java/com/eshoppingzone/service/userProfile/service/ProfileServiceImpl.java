// package com.eshoppingzone.service.userProfile.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.eshoppingzone.dao.userProfile.repository.ProfileRepository;
// import com.eshoppingzone.entity.userProfile.entity.UserProfile;

// @Service
// public class ProfileServiceImpl implements ProfileService {

    
//     public ProfileServiceImpl() {
//     }

//     @Autowired
//     private ProfileRepository userRepository;

//     @Override
//     public UserProfile addNewCustomerProfile(UserProfile userProfile) {
//         return userRepository.save(userProfile);
//     }

//     @Override
//     public Optional<UserProfile> getByProfileId(int id) {

//         return userRepository.findById((long) id);
//     }

//     @Override
//     public void updateProfile(UserProfile userProfile) {

//         userRepository.save(userProfile);

//     }

//     @Override
//     public void deleteProfile(int id) {

//         userRepository.deleteById((long) id);

//     }

//     @Override
//     public void addNewMerchantProfile(UserProfile userProfile) {

//         userRepository.save(userProfile);

//     }

//     @Override
//     public void addDeliveryProfile(UserProfile userProfile) {

//         userRepository.save(userProfile);
//     }

//     @Override
//     public UserProfile findByMobileNumber(long mobileNumber) {

//         return userRepository.findAllByMobileNumber(mobileNumber);
//         // return null;

//     }

//     @Override
//     public UserProfile getByUserName(String userName) {
//         return userRepository.findByFullName(userName);
//         // return null;
//     }

//     @Override
//     public List<UserProfile> getAllProfile() {
//         return userRepository.findAll();
//     };

// }


// package com.eshoppingzone.service.userProfile.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.eshoppingzone.dao.userProfile.repository.ProfileRepository;
// import com.eshoppingzone.entity.userProfile.entity.UserProfile;
// import com.eshoppingzone.entity.userProfile.entity.Address;

// @Service
// public class ProfileServiceImpl implements ProfileService {

//     private final ProfileRepository userRepository;

//     @Autowired
//     public ProfileServiceImpl(ProfileRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Override
//     public UserProfile addNewCustomerProfile(UserProfile userProfile) {
//         return userRepository.save(userProfile);
//     }

//     @Override
//     public Optional<UserProfile> getByProfileId(int id) {
//         return userRepository.findById((long) id);
//     }

//     @Override
//     public void updateProfile(UserProfile userProfile) {
//         userRepository.save(userProfile);
//     }

//     @Override
//     public void deleteProfile(int id) {
//         userRepository.deleteById((long) id);
//     }

//     @Override
//     public void addNewMerchantProfile(UserProfile userProfile) {
//         userRepository.save(userProfile);
//     }

//     @Override
//     public void addDeliveryProfile(UserProfile userProfile) {
//         userRepository.save(userProfile);
//     }

//     @Override
//     public UserProfile findByMobileNumber(long mobileNumber) {
//         return userRepository.findAllByMobileNumber(mobileNumber);
//     }

//     @Override
//     public UserProfile getByUserName(String userName) {
//         return userRepository.findByFullName(userName);
//     }

//     @Override
//     public List<UserProfile> getAllProfile() {
//         return userRepository.findAll();
//     }

//     @Override
//     public void addAddressToProfile(Long profileId, Address address) {
//         Optional<UserProfile> optionalProfile = userRepository.findById(profileId);
//         if (optionalProfile.isPresent()) {
//             UserProfile userProfile = optionalProfile.get();
//             List<Address> addresses = userProfile.getAddress();
//             addresses.add(address);
//             userProfile.setAddress(addresses);
//             userRepository.save(userProfile);
//         } else {
//             // Handle case when profile with given ID does not exist
//         }
//     }
// }


// package com.eshoppingzone.service.userProfile.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.eshoppingzone.dao.userProfile.repository.ProfileRepository;
// import com.eshoppingzone.entity.userProfile.entity.UserProfile;
// import com.eshoppingzone.entity.userProfile.entity.Address;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class ProfileServiceImpl implements ProfileService {

//     @Autowired
//     private ProfileRepository userRepository;

//     @Override
//     public UserProfile addNewCustomerProfile(UserProfile userProfile) {
//         return userRepository.save(userProfile);
//     }

//     @Override
//     public Optional<UserProfile> getByProfileId(int id) {
//         return userRepository.findById((long) id);
//     }

//     @Override
//     public void updateProfile(UserProfile userProfile) {
//         userRepository.save(userProfile);
//     }

//     @Override
//     public void deleteProfile(int id) {
//         userRepository.deleteById((long) id);
//     }

//     @Override
//     public void addNewMerchantProfile(UserProfile userProfile) {
//         userRepository.save(userProfile);
//     }

//     @Override
//     public void addDeliveryProfile(UserProfile userProfile) {
//         userRepository.save(userProfile);
//     }

//     @Override
//     public UserProfile findByMobileNumber(long mobileNumber) {
//         return userRepository.findAllByMobileNumber(mobileNumber);
//     }

//     @Override
//     public UserProfile getByUserName(String userName) {
//         return userRepository.findByFullName(userName);
//     }

//     @Override
//     public List<UserProfile> getAllProfile() {
//         return userRepository.findAll();
//     }

//     @Override
//     public UserProfile addAddressToProfile(Long profileId, Address address) {
//         UserProfile userProfile = userRepository.findById(profileId).orElse(null);
//         if (userProfile != null) {
//             address.setUserProfile(userProfile);
//             userProfile.getAddress().add(address);
//             userRepository.save(userProfile);
//         }
//         return userProfile;
//     }
// }







package com.eshoppingzone.service.userProfile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingzone.dao.userProfile.repository.ProfileRepository;
import com.eshoppingzone.entity.userProfile.entity.UserProfile;
import com.eshoppingzone.entity.userProfile.entity.Address;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {

 


    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
    @Override
    public UserProfile addNewCustomerProfile(UserProfile userProfile) {
        // Perform any necessary validation or processing before saving the user profile
        return profileRepository.save(userProfile);
    }

    @Override
    public List<UserProfile> getAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public Optional<UserProfile> getByProfileId(int id) {
        return profileRepository.findById((long) id);
    }

    @Override
    public void updateProfile(UserProfile userProfile) {
        // Perform any necessary validation or processing before updating the user
        // profile
        profileRepository.save(userProfile);
    }

    @Override
    public void deleteProfile(int id) {
        profileRepository.deleteById((long) id);
    }

    @Override
    public void addNewMerchantProfile(UserProfile userProfile) {
        // Perform any necessary validation or processing specific to merchant profiles
        profileRepository.save(userProfile);
    }

    @Override
    public void addDeliveryProfile(UserProfile userProfile) {
        // Perform any necessary validation or processing specific to delivery profiles
        profileRepository.save(userProfile);
    }

    @Override
    public UserProfile findByMobileNumber(long mobileNumber) {
        return profileRepository.findAllByMobileNumber(mobileNumber);
    }

    public UserProfile getByUserName(UserProfile userDTO) {
        // Check if the user already exists in the database
        UserProfile existingUser = profileRepository.findByFullName(userDTO.getFullName());

        if (existingUser != null) {
            return existingUser;
        } else {
            // Save the new user to the database
            return profileRepository.save(userDTO);
        }

    }
 
}
