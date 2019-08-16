package readinglist;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(JdbcTemplateCondition.class)
public class MyService {
}
