package example.mybatis;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MyController {

    @Autowired
    private MyService myService;

    // [C] 1. 등록
    @PostMapping("/save")
    public int save(UserDto userDto){
        return myService.save(userDto);
    }   // save() end

    // [R] 2. 전체출력
    @GetMapping("/findall")
    public List<UserDto> findAll(){
        return myService.findAll();
    }   // findAll() end

    // [R] 2-2 개별출력
    @GetMapping("/find")
    public UserDto findById(int id){
        return myService.findById(id);
    }   // findById() end

    // [U] 3. 수정
    @PutMapping("/update")
    public int update(UserDto userDto){
        return myService.update(userDto);
    }   // update() end

    // [D] 4. 삭제
    @DeleteMapping("/delete")
    public int delete(int id){
        return myService.delete(id);
    }   // delete() end

}   // class end
