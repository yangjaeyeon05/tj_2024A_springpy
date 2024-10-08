package example.task1;

import example.mybatis.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    // [R] 1. 전체출력
    @GetMapping("/findall")
    public List<AccountDto> findAll(){
        return accountService.findAll();
    }   // findAll() end

    // [C] 2. 등록
    @PostMapping("/add")
    public int add(@RequestBody AccountDto accountDto){
        System.out.println("AccountController.add");
        System.out.println("accountDto = " + accountDto);
        return accountService.add(accountDto);
    }   // add() end

    // [U] 3. 수정
    @PutMapping("/update")
    public int update(@RequestBody AccountDto accountDto){
        System.out.println("AccountController.update");
        System.out.println("accountDto = " + accountDto);
        return accountService.update(accountDto);
    }   // update() end

    // [D] 4. 삭제
    @DeleteMapping("/delete")
    public int delete(int accountId){
        System.out.println("AccountController.delete");
        System.out.println("accountId = " + accountId);
        return accountService.delete(accountId);
    }   // delete() end

}
