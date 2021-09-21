package com.dbs.web.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.web.beans.Transaction;
import com.dbs.web.repository.TransactionRepository;

@Service
public class TransactionService {
@Autowired
private TransactionRepository transactionrepository;

 public Transaction getBycustomerId(int id) {
// TODO Auto-generated method stub
return transactionrepository.findById(id).get();
}

 public int postTransaction(Transaction tran) {
if(this.transactionrepository.findById(tran.getTransactionid()).isPresent())
return -1;
try {
return this.transactionrepository.save(tran).getTransactionid();
}
catch(IllegalArgumentException e)
{
return -1;
}



}

}