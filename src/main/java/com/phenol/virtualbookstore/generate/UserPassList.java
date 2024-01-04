package com.phenol.virtualbookstore.generate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import javax.swing.text.html.Option;

import org.springframework.stereotype.Component;

import com.phenol.virtualbookstore.entity.UserPass;
import com.phenol.virtualbookstore.entity.UserRole;

@Component
public class UserPassList {
    
    public UserPassList() {
        super();
    }

    public List<UserPass> generateUserPassList() {
        return Arrays.asList(new UserPass("tejpal", "phenol", UserRole.ADMIN),
                        new UserPass("ayushi", "ayu", UserRole.SENIOR_DEVELOPER),
                        new UserPass("root", "password", UserRole.MAINTAINER));
    }

    public Optional<UserPass> checkUserPass(List<UserPass> user, String targetName, String targetPassword) {
        Optional<UserPass> exists = user.stream().filter(u -> u.getUserName().equals(targetName) && u.getPassword().equals(targetPassword)).findAny();
        return exists;
        // Predicate<UserPass> userExists = u -> u.getUserName().equals(targetName) && u.getPassword().equals(targetPassword);

        // boolean exists = user.stream().anyMatch(userExists);
        // return exists;
    }

}
