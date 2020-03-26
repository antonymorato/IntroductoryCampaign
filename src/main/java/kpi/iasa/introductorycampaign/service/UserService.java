package kpi.iasa.introductorycampaign.service;

import kpi.iasa.introductorycampaign.domain.User;
import kpi.iasa.introductorycampaign.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service

public class UserService implements UserDetailsService {


    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }

    public void addUser(User user){
        userRepo.save(user);

    }
}
