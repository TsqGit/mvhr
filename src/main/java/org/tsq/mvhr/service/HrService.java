package org.tsq.mvhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.tsq.mvhr.mapper.HrMapper;
import org.tsq.mvhr.model.Hr;

@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(userName);
        if (hr == null) {
            throw new  UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
}
