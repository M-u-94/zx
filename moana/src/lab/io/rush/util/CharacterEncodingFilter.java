package lab.io.rush.util;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**    
 * 用于设置 HTTP 请求字符编码的过滤器，通过过滤器参数encoding指明使用何种字符编码,用于处理Html Form请求参数的中文问题    
 */
public class CharacterEncodingFilter implements Filter {
    private FilterConfig filterConfig;
    private String encoding = "";
    
    public void destroy() {
        filterConfig = null;
        encoding = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        System.out.println("444");
    	if(encoding != null){
            request.setCharacterEncoding(encoding);//设置字符编码
            chain.doFilter(request, response);//将请求和响应转向下一个链接
        }
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        this.encoding = this.filterConfig.getInitParameter("encoding");// 获得web.xml文件中的过滤器中的初始化值encoding
    }
}