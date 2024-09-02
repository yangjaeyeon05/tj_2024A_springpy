package example.task1;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
@Log4j2
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    // [R] 1. 전체출력
    public List<AccountDto> findAll(){
        return accountDao.findAll();
    }   // findAll() end

    // [C] 2. 등록
    public int add(AccountDto accountDto){
        int result = accountDao.add(accountDto);
        if (result == 1){
            log.info("add success");
        }
        return result;
    }   // add() end

    // [U] 3. 수정
    public int update(AccountDto accountDto){
        int result = accountDao.update(accountDto);
        if (result == 1){
            log.info("update success");
        }
        return result;
    }   // update() end

    // [D] 4. 삭제
    public int delete(int accountId){
        int result = accountDao.delete(accountId);
        if (result == 1){
            log.info("delete success");
        }
        return result;
    }   // delete() end

}
