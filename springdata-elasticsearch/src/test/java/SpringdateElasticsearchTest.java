import com.itheima.es.entity.Article;
import com.itheima.es.repositories.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhaoxl01
 * @Description SpringdateElasticsearchTest
 * @date 2019/9/4
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringdateElasticsearchTest {


    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private ElasticsearchTemplate template;

    @Test
    public void createIndex(){
        template.createIndex(Article.class);

    }

    @Test
    public void  createDocument(){

    }









}
