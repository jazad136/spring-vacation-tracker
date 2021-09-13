package com.jsaddlercs.vactrac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.jsaddlercs.vactrac.data.RoomRepository;
import com.jsaddlercs.vactrac.model.Room;

@SpringBootApplication
public class VacTracWarApplication extends SpringBootServletInitializer implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VacTracWarApplication.class, args);
	}

	@Autowired
	RoomRepository rep;
	@Override
	public void run(String... strings) throws Exception {
		Room coi6 =new Room("Comfort Inn Lakeside", "2Q", 2, 125.00, "0906",
		"https://www.choicehotels.com/michigan/mackinaw-city/comfort-inn-hotels/mi076/rates?adults=3&checkInDate=2021-09-13&checkOutDate=2021-09-15");
		Room cli6 = new Room("Clarion Hotel Beachfront","2Q", 2, 94.00, "0906",
		"https://www.choicehotels.com/michigan/mackinaw-city/clarion-hotels/mi203/rates?adults=3&checkInDate=2021-09-13&checkOutDate=2021-09-15");
		List<Room> allRooms = new LinkedList<>();
		
		allRooms.addAll(Arrays.asList(new Room("Best Western Plus Dockside", "2Q", 2, 269.00, "0906",
		"https://www.bestwestern.com/en_US/book/mackinaw-city/hotel-rooms/best-western-plus-dockside-waterfront-inn/propertyCode.23098.html"),
		new Room("Holiday Inn Express Mackinaw", "2Q", 2, 156.40, "0906",
		"https://www.ihg.com/hotels/us/en/find-hotels/hotel/rooms?qDest=Mackinaw%20City,%20MI,%20United%20States&qCiMy=82021&qCiD=6&qCoMy=82021&qCoD=8&qAdlt=3&qChld=0&qRms=1&qRtP=6CBARC&qSlH=MACMI&qAkamaiCC=US&qSrt=sAV&qBrs=re.ic.in.vn.cp.vx.hi.ex.rs.cv.sb.cw.ma.ul.ki.va.ii.sp.nd.ct.sx.we&qAAR=IDARP&qWch=0&qSmP=1&setPMCookies=true&qRad=30&qRdU=mi&srb_u=1&qpMn=1"),
		new Room("Comfort Inn Lakeside", "2Q", 2, 103.00, "0908",
		"https://www.choicehotels.com/michigan/mackinaw-city/comfort-inn-hotels/mi076/rates?adults=3&checkInDate=2021-09-08&checkOutDate=2021-09-10"),
		new Room("Clarion Hotel Beachfront","2Q", 2, 99.00, "0908",
		"https://www.choicehotels.com/michigan/mackinaw-city/clarion-hotels/mi203/rates?adults=3&checkInDate=2021-09-08&checkOutDate=2021-09-10"),
		new Room("Best Western Plus Dockside", "2Q", 2, 161.10, "0908",
		"https://www.bestwestern.com/en_US/book/mackinaw-city/hotel-rooms/best-western-plus-dockside-waterfront-inn/propertyCode.23098.html"),
		new Room("Holiday Inn Express Mackinaw", "2D", 2, 179.60, "0908",
		"https://www.ihg.com/hotels/us/en/find-hotels/hotel/rooms?qDest=Mackinaw%20City,%20MI,%20United%20States&qCiMy=82021&qCiD=8&qCoMy=82021&qCoD=10&qAdlt=3&qChld=0&qRms=1&qRtP=6CBARC&qSlH=MACMI&qAkamaiCC=US&qSrt=sAV&qBrs=re.ic.in.vn.cp.vx.hi.ex.rs.cv.sb.cw.ma.ul.ki.va.ii.sp.nd.ct.sx.we&qAAR=IDARP&qWch=0&qSmP=1&setPMCookies=true&qRad=30&qRdU=mi&srb_u=1&qpMn=1"),
		new Room("Holiday Inn Express Mackinaw", "1KS", 2, 184.11, "0908",
		"https://www.ihg.com/hotels/us/en/find-hotels/hotel/rooms?qDest=Mackinaw%20City,%20MI,%20United%20States&qCiMy=82021&qCiD=8&qCoMy=82021&qCoD=10&qAdlt=3&qChld=0&qRms=1&qRtP=6CBARC&qSlH=MACMI&qAkamaiCC=US&qSrt=sAV&qBrs=re.ic.in.vn.cp.vx.hi.ex.rs.cv.sb.cw.ma.ul.ki.va.ii.sp.nd.ct.sx.we&qAAR=IDARP&qWch=0&qSmP=1&setPMCookies=true&qRad=30&qRdU=mi&srb_u=1&qpMn=1"),
		new Room("Baymont Mackinaw City","2Q", 2, 179.00,"0908",
		"https://www.wyndhamhotels.com/baymont/mackinaw-city-michigan/baymont-inn-and-suites-mackinaw-city/rooms-rates?brand_id=BU&brandTier=hr&checkInDate=9/8/2021&checkOutDate=9/10/2021&useWRPoints=false&children=0&adults=3&rooms=1&referringBrand=HR&loc=ChIJ1fKeTxr2NU0RIEBbMHs-TXY&sessionId=1629563148"),
		new Room("Comfort Inn Lakeside", "2Q", 2, 131.00, "0913",
		"https://www.choicehotels.com/michigan/mackinaw-city/comfort-inn-hotels/mi076/rates?adults=3&checkInDate=2021-09-13&checkOutDate=2021-09-15"),
		new Room("Clarion Hotel Beachfront","2Q", 2, 99.00, "0913",
		"https://www.choicehotels.com/michigan/mackinaw-city/clarion-hotels/mi203/rates?adults=3&checkInDate=2021-09-13&checkOutDate=2021-09-15"),
		new Room("Best Western Plus Dockside", "2Q", 2, 161.10, "0913",
		"https://www.bestwestern.com/en_US/book/mackinaw-city/hotel-rooms/best-western-plus-dockside-waterfront-inn/propertyCode.23098.html"),
		new Room("Holiday Inn Express Mackinaw", "2Q", 2, 184.11, "0913",
		"https://www.ihg.com/hotels/us/en/find-hotels/hotel/rooms?qDest=Mackinaw%20City,%20MI,%20United%20States&qCiMy=82021&qCiD=13&qCoMy=82021&qCoD=15&qAdlt=3&qChld=0&qRms=1&qRtP=6CBARC&qSlH=MACMI&qAkamaiCC=US&qSrt=sAV&qBrs=re.ic.in.vn.cp.vx.hi.ex.rs.cv.sb.cw.ma.ul.ki.va.ii.sp.nd.ct.sx.we&qAAR=IDARP&qWch=0&qSmP=1&setPMCookies=true&qRad=30&qRdU=mi&srb_u=1&qpMn=1"),
		new Room("Baymont Mackinaw City","2Q", 2, 159.00,"0913",
		"https://www.wyndhamhotels.com/baymont/mackinaw-city-michigan/baymont-inn-and-suites-mackinaw-city/rooms-rates?brand_id=BU&brandTier=hr&checkInDate=9/13/2021&checkOutDate=9/15/2021&useWRPoints=false&children=0&adults=3&rooms=1&referringBrand=HR&loc=ChIJ1fKeTxr2NU0RIEBbMHs-TXY&sessionId=1629563148"
		)));
		rep.save(coi6);
		rep.save(cli6);
		rep.saveAll(allRooms);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(VacTracWarApplication.class);
	}
}
