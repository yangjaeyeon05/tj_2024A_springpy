package example.task1;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {

    // [R] 1. 전체출력
    List<AccountDto> findAll();
    // [C] 2. 등록
    int add(AccountDto accountDto);
    // [U] 3. 수정
    int update(AccountDto accountDto);
    // [D] 4. 삭제
    int delete(int accountId);

}
