//package com.dbs.web.service;
//import java.util.List;
//import java.util.Optional;
//import javax.persistence.EntityNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.dbs.web.beans.Bank;
//import com.dbs.web.beans.CustomerUser;
//import com.dbs.web.beans.Transaction;
//import com.dbs.web.repository.CustomerUserRepository;
//
// 
//
//@Service
//public class LoginService {
//    @Autowired
//    CustomerUserRepository repo;
//    public CustomerUser getAllBycustomerId(int id){
//         try { 
//                Optional<CustomerUser> c=this.repo.findById(id);
//                return c.orElseThrow(()->{
//                    return new EntityNotFoundException("Bank with "+id + " does not exist");
//                });
//                }
//            catch(IllegalArgumentException iae) {
//                return null;
//            }
//            }
//
// 
//
//}
// 