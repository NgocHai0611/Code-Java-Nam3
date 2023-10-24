package fit.iuh;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/SanPhamController")
public class SanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SanPhamDao sanPham;

	@Resource(name = "jdbc/QLDM")
	private DataSource dataSoure;

	public void init() throws ServletException {
		super.init();
		try {
			sanPham = new SanPhamDao(dataSoure);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getParameter("command");
		if (command == null) {
			command = "LIST";
		}
		switch (command) {
		case "LIST": {
			loadSanPham(request, response);
			break;
		}
		case "LOAD": {
			updateSanPham(request, response);
			break;
		}
		case "DELETE": {
			deleteSanPham(request, response);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + command);
		}
	}

	private void listSanPham(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		List<SanPham> list = sanPham.getAllSanPham();
		request.setAttribute("SANPHAM_LIST", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ListSanPham.jsp");
		dispatcher.forward(request, respone);
	}

	private void loadSanPham(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/HomePage.jsp");
		dispatcher.forward(request, respone);
		listSanPham(request, respone);
	}

	private void updateSanPham(HttpServletRequest request, HttpServletResponse respone) {
		
	}

	private void deleteSanPham(HttpServletRequest request, HttpServletResponse respone) {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
