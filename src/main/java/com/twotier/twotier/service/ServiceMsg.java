package com.twotier.twotier.service;

import com.twotier.twotier.Repository.RepositoryMsg;
import com.twotier.twotier.model.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMsg {

    @Autowired
    RepositoryMsg rep;

    public Msg setMsg(Msg msg) {
    return rep.save(msg);

    }

    }
