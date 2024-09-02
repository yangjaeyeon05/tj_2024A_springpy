package example.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface MyDao {
    // 인터페이스는 추상메소드로 구현구를 가지고 있지 않는다.
    // (1) 추상메소드
    // [C] 1. 등록
    int save(UserDto userDto);
    // [R] 2. 전체출력
    List<UserDto> findAll();
    // [R] 2-2 개별출력
    UserDto findById(int id);
    // [U] 3. 수정
    int update(UserDto userDto);
    // [D] 4. 삭제
    int delete (int id);

}
