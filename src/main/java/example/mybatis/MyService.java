package example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private MyDao myDao;
    // [C] 1. 등록
    public int save(UserDto userDto){
        return myDao.save(userDto);
    }
    // [R] 2. 전체출력
    public List<UserDto> findAll(){
        return myDao.findAll();
    }   // findAll() end

    // [R] 2-2 개별출력
    public UserDto findById(int id){
        return myDao.findById(id);
    }   // findById() end

    // [U] 3. 수정
    public int update(UserDto userDto){
        return myDao.update(userDto);
    }   // update() end

    // [D] 4. 삭제
    public int delete(int id){
        return myDao.delete(id);
    }   // delete() end

}   // class end
