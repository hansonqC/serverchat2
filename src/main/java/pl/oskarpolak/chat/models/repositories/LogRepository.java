package pl.oskarpolak.chat.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.chat.models.LogModel;

/**
 * Created by lukasz on 2017-11-05.
 */
@Repository
public interface LogRepository extends CrudRepository<LogModel, Integer>{

}
