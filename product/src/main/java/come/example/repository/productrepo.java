package come.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.product;

@Repository //stereo type anotation

public interface productrepo extends JpaRepository<product,Integer>{

}
