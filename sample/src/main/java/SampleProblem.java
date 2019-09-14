package GenerateRandom;
import java.util.Random;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;


public class SampleProblem extends HttpServlet{
        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setAttribute("ranNum", randomNumber);
		resp.setContentType("text/plain");
		RequestDispatcher dispatch = req.getRequestDispatcher("index.jsp");
		dispatch.forward(req, resp);
        }
        public static int generateRandom() {
                Random rand = new Random();
                int randomNumber = rand.nextInt(1000000) + 1;

                return randomNumber;
        }
}
