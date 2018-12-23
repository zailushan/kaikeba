import com.kkb.service.BaseService;
import com.kkb.serviceImpl.蝉;
import com.kkb.util.BeanFactory;

public class TestMain {

	public static void main(String[] args) {
		
		BaseService 小蝉 = BeanFactory.newInstance(蝉.class);
		小蝉.eat();
		
		
	}

}
