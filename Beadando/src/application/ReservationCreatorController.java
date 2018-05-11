package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import models.Reservation;

public class ReservationCreatorController {

	List<Reservation> selectedReservations = new ArrayList<Reservation>();
	List<Reservation> list = new ArrayList<Reservation>();
	String date25 = "";
	String date50 = "";

	@FXML
	private Button btn_vissza;
	public DatePicker RC25DatePicker, RC50DatePicker;
	public ChoiceBox<String> CB50;
	public Button Reservation2500, Reservation2510, Reservation2520, Reservation2530, Reservation2501, Reservation2511,
			Reservation2521, Reservation2531, Reservation2502, Reservation2512, Reservation2522, Reservation2532,
			Reservation2503, Reservation2513, Reservation2523, Reservation2533, Reservation2504, Reservation2514,
			Reservation2524, Reservation2534, Reservation2505, Reservation2515, Reservation2525, Reservation2535;
	public Button RC2500, RC2501, RC2502, RC2503, RC2504, RC2505, RC2510, RC2511, RC2512, RC2513, RC2514, RC2515,
			RC2520, RC2521, RC2522, RC2523, RC2524, RC2525, RC2530, RC2531, RC2532, RC2533, RC2534, RC2535;
	public Button RC5000, RC5001, RC5002, RC5003, RC5004, RC5005, RC5010, RC5011, RC5012, RC5013, RC5014, RC5015,
			RC5020, RC5021, RC5022, RC5023, RC5024, RC5025, RC5030, RC5031, RC5032, RC5033, RC5034, RC5035;

	@FXML
	public void vissza(ActionEvent event) throws IOException {
		Stage stage = (Stage) btn_vissza.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("../views/mainPage.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("application/application.css");
		stage.setScene(scene);
	}

	@FXML
	public void load25() {
		RC2500.setStyle("-fx-background-color: green");
		RC2501.setStyle("-fx-background-color: green");
		RC2502.setStyle("-fx-background-color: green");
		RC2503.setStyle("-fx-background-color: green");
		RC2504.setStyle("-fx-background-color: green");
		RC2505.setStyle("-fx-background-color: green");
		RC2510.setStyle("-fx-background-color: green");
		RC2511.setStyle("-fx-background-color: green");
		RC2512.setStyle("-fx-background-color: green");
		RC2513.setStyle("-fx-background-color: green");
		RC2514.setStyle("-fx-background-color: green");
		RC2515.setStyle("-fx-background-color: green");
		RC2520.setStyle("-fx-background-color: green");
		RC2521.setStyle("-fx-background-color: green");
		RC2522.setStyle("-fx-background-color: green");
		RC2523.setStyle("-fx-background-color: green");
		RC2524.setStyle("-fx-background-color: green");
		RC2525.setStyle("-fx-background-color: green");
		RC2530.setStyle("-fx-background-color: green");
		RC2531.setStyle("-fx-background-color: green");
		RC2532.setStyle("-fx-background-color: green");
		RC2533.setStyle("-fx-background-color: green");
		RC2534.setStyle("-fx-background-color: green");
		RC2535.setStyle("-fx-background-color: green");

		String id25 = "";
		Integer ev25 = RC25DatePicker.getValue().getYear();
		Integer honap25 = RC25DatePicker.getValue().getMonthValue();
		Integer nap25 = RC25DatePicker.getValue().getDayOfMonth();
		date25 = ev25.toString() + honap25.toString() + nap25.toString();

		JsonHandler handler = new JsonHandler();
		list = handler.read();
		for (Reservation reservation : list) {

			if (reservation.getDate().equals(date25)) {
				id25 = "RC" + reservation.getPoolId() + reservation.getLane() + reservation.getTime();
				System.out.println(id25);

				System.out.println(date25);
				System.out.println(reservation.getDate());
				// System.out.println(date50);
				if (reservation.getDate().equals(date25)) {
					switch (id25) {
					case "RC2500":
						RC2500.setStyle("-fx-background-color: red;");
						break;
					case "RC2501":
						RC2501.setStyle("-fx-background-color: red;");
						break;
					case "RC2502":
						RC2502.setStyle("-fx-background-color: red;");
						break;
					case "RC2503":
						RC2503.setStyle("-fx-background-color: red;");
						break;
					case "RC2504":
						RC2504.setStyle("-fx-background-color: red;");
						break;
					case "RC2505":
						RC2505.setStyle("-fx-background-color: red;");
						break;
					case "RC2510":
						RC2510.setStyle("-fx-background-color: red;");
						break;
					case "RC2511":
						RC2511.setStyle("-fx-background-color: red;");
						break;
					case "RC2512":
						RC2512.setStyle("-fx-background-color: red;");
						break;
					case "RC2513":
						RC2513.setStyle("-fx-background-color: red;");
						break;
					case "RC2514":
						RC2514.setStyle("-fx-background-color: red;");
						break;
					case "RC2515":
						RC2515.setStyle("-fx-background-color: red;");
						break;
					case "RC2520":
						RC2520.setStyle("-fx-background-color: red;");
						break;
					case "RC2521":
						RC2521.setStyle("-fx-background-color: red;");
						break;
					case "RC2522":
						RC2522.setStyle("-fx-background-color: red;");
						break;
					case "RC2523":
						RC2523.setStyle("-fx-background-color: red;");
						break;
					case "RC2524":
						RC2524.setStyle("-fx-background-color: red;");
						break;
					case "RC2525":
						RC2525.setStyle("-fx-background-color: red;");
						break;
					case "RC2530":
						RC2530.setStyle("-fx-background-color: red;");
						break;
					case "RC2531":
						RC2531.setStyle("-fx-background-color: red;");
						break;
					case "RC2532":
						RC2532.setStyle("-fx-background-color: red;");
						break;
					case "RC2533":
						RC2533.setStyle("-fx-background-color: red;");
						break;
					case "RC2534":
						RC2534.setStyle("-fx-background-color: red;");
						break;
					case "RC2535":
						RC2535.setStyle("-fx-background-color: red;");
						break;
					}
				}
			}
		}
	}

	@FXML
	public void load50() {
		RC5000.setStyle("-fx-background-color: green");
		RC5001.setStyle("-fx-background-color: green");
		RC5002.setStyle("-fx-background-color: green");
		RC5003.setStyle("-fx-background-color: green");
		RC5004.setStyle("-fx-background-color: green");
		RC5005.setStyle("-fx-background-color: green");
		RC5010.setStyle("-fx-background-color: green");
		RC5011.setStyle("-fx-background-color: green");
		RC5012.setStyle("-fx-background-color: green");
		RC5013.setStyle("-fx-background-color: green");
		RC5014.setStyle("-fx-background-color: green");
		RC5015.setStyle("-fx-background-color: green");
		RC5020.setStyle("-fx-background-color: green");
		RC5021.setStyle("-fx-background-color: green");
		RC5022.setStyle("-fx-background-color: green");
		RC5023.setStyle("-fx-background-color: green");
		RC5024.setStyle("-fx-background-color: green");
		RC5025.setStyle("-fx-background-color: green");
		RC5030.setStyle("-fx-background-color: green");
		RC5031.setStyle("-fx-background-color: green");
		RC5032.setStyle("-fx-background-color: green");
		RC5033.setStyle("-fx-background-color: green");
		RC5034.setStyle("-fx-background-color: green");
		RC5035.setStyle("-fx-background-color: green");

		String id50 = "";
		Integer ev50 = RC50DatePicker.getValue().getYear();
		Integer honap50 = RC50DatePicker.getValue().getMonthValue();
		Integer nap50 = RC50DatePicker.getValue().getDayOfMonth();
		date50 = ev50.toString() + honap50.toString() + nap50.toString();

		JsonHandler handler = new JsonHandler();
		list = handler.read();
		for (Reservation reservation : list) {

			if (reservation.getDate().equals(date25)) {
				id50 = "RC" + reservation.getPoolId() + reservation.getLane() + reservation.getTime();
				System.out.println(id50);

				System.out.println(date25);
				System.out.println(reservation.getDate());
				// System.out.println(date50);
				if (reservation.getDate().equals(date25)) {
					switch (id50) {
					case "RC5000":
						RC5000.setStyle("-fx-background-color: red;");
						break;
					case "RC5001":
						RC5001.setStyle("-fx-background-color: red;");
						break;
					case "RC5002":
						RC5002.setStyle("-fx-background-color: red;");
						break;
					case "RC5003":
						RC5003.setStyle("-fx-background-color: red;");
						break;
					case "RC5004":
						RC5004.setStyle("-fx-background-color: red;");
						break;
					case "RC5005":
						RC2505.setStyle("-fx-background-color: red;");
						break;
					case "RC5010":
						RC5010.setStyle("-fx-background-color: red;");
						break;
					case "RC5011":
						RC5011.setStyle("-fx-background-color: red;");
						break;
					case "RC5012":
						RC2512.setStyle("-fx-background-color: red;");
						break;
					case "R5013":
						RC5013.setStyle("-fx-background-color: red;");
						break;
					case "RC5014":
						RC5014.setStyle("-fx-background-color: red;");
						break;
					case "RC5015":
						RC5015.setStyle("-fx-background-color: red;");
						break;
					case "RC5020":
						RC5020.setStyle("-fx-background-color: red;");
						break;
					case "RC5021":
						RC5021.setStyle("-fx-background-color: red;");
						break;
					case "RC5022":
						RC5022.setStyle("-fx-background-color: red;");
						break;
					case "RC5023":
						RC5023.setStyle("-fx-background-color: red;");
						break;
					case "RC5024":
						RC5024.setStyle("-fx-background-color: red;");
						break;
					case "RC5025":
						RC5025.setStyle("-fx-background-color: red;");
						break;
					case "RC5030":
						RC5030.setStyle("-fx-background-color: red;");
						break;
					case "RC5031":
						RC5031.setStyle("-fx-background-color: red;");
						break;
					case "RC5032":
						RC5032.setStyle("-fx-background-color: red;");
						break;
					case "RC5033":
						RC5033.setStyle("-fx-background-color: red;");
						break;
					case "RC5034":
						RC5034.setStyle("-fx-background-color: red;");
						break;
					case "RC5035":
						RC5035.setStyle("-fx-background-color: red;");
						break;
					}
				}
			}
		}
	}

	@FXML
	public void collect(ActionEvent event) throws IOException {
		Button button = (Button) event.getSource();
		String title = button.getId();
		System.out.println(title);
		String pool_id, date, lane_id, time;
		pool_id = title.substring(2, 4);
		System.out.println(pool_id);
		date = date25;
		lane_id = title.substring(4, 5);
		System.out.println(lane_id);
		time = title.substring(5, 6);
		System.out.println(time);

		button.setStyle("-fx-background-color: blue;");

		Reservation reservation = new Reservation(pool_id, date, lane_id, time);

		selectedReservations.add(reservation);

	}
	
//	@FXML
//	public void calculate50() {
//		int sum = 0;
//			for (Reservation reservation : selectedReservations) {
//				sum = sum+1;
//			}
//			String a = CB50.getValue();
//			System.out.println(sum);
////			switch(a) {
////			case "Feln�tt" : 
////			}
//			
		
//	}

	@FXML
	public void reserve25(ActionEvent event) throws IOException {
		JsonHandler handler = new JsonHandler();
		list.addAll(selectedReservations);
		handler.jWrite(list);
		selectedReservations = new ArrayList<Reservation>();
		load25();
	}

	@FXML
	public void reserve50(ActionEvent event) throws IOException {
		JsonHandler handler = new JsonHandler();
		list.addAll(selectedReservations);
		handler.jWrite(list);
		selectedReservations = new ArrayList<Reservation>();
//		calculate50();
		load50();

	}

	@FXML
	public void delete25(ActionEvent event) throws IOException {
		JsonHandler handler = new JsonHandler();
		System.out.println(list + "t�rl�s el�tt");
		list.removeAll(selectedReservations);

		// for (Reservation reservation : selectedReservations) {
		// list.remove(reservation);
		// }
		handler.jWrite(list);
		System.out.println(list + "t�rl�s ut�n");
		selectedReservations = new ArrayList<Reservation>();
		load25();
		

	}

	@FXML
	public void delete50(ActionEvent event) throws IOException {
		JsonHandler handler = new JsonHandler();
		System.out.println(list + "t�rl�s el�tt");
		list.removeAll(selectedReservations);

		// for (Reservation reservation : selectedReservations) {
		// list.remove(reservation);
		// }
		handler.jWrite(list);
		System.out.println(list + "t�rl�s ut�n");
		selectedReservations = new ArrayList<Reservation>();
		load50();

	}

	@FXML
	public void initialize() {
		CB50.getItems().add("Feln�tt");
		CB50.getItems().add("Gyerek");
		CB50.getItems().add("Nyugd�jas");
		CB50.getItems().add("Di�k");
	}


}
