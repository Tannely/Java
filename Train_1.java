public class Train_1 {

        private String destination = ""; // Пункт призначення
        private int trainNumber = 0; // Номер поїзда
        private String departureTime = ""; // Час відправлення
        private int generalSeats = 0; // Кількість загальних місць
        private int coupeSeats = 0; // Кількість місць купе
        private int reservedSeats = 0; // Кількість місць плацкарт
        private int luxurySeats = 0; // Кількість місць люкс
        private boolean flag = false; // прапорець невідповідності
        public String getDestination() {
            return destination;
        }
        
        public void setDestination(String destination) {
            switch (destination){
            case "Kyiv":
            case "Lviv":
            case "Odessa":
            //case "Dnipro":
            //case "Kharkiv":
            flag = true;
            break;
            default:
            flag = false;
            break;
            }
            if (!flag){
                destination = destination + "Пункт призначення недоступний";

            }

            this.destination = destination;
        }
        
        public int getTrainNumber() {
            return trainNumber;
        }
        
        public void setTrainNumber(int trainNumber) {
            this.trainNumber = trainNumber;
        }
        
        public String getDepartureTime() {
            return departureTime;
        }
        
        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }
        
        public int getGeneralSeats() {
            return generalSeats;
        }
        
        public void setGeneralSeats(int generalSeats) {
            this.generalSeats = generalSeats;
        }
        
        public int getCoupeSeats() {
            return coupeSeats;
        }
        
        public void setCoupeSeats(int coupeSeats) {
            this.coupeSeats = coupeSeats;
        }
        
        public int getReservedSeats() {
            return reservedSeats;
        }
        
        public void setReservedSeats(int reservedSeats) {
            this.reservedSeats = reservedSeats;
        }
        
        public int getLuxurySeats() {
            return luxurySeats;
        }
        
        public void setLuxurySeats(int luxurySeats) {
            this.luxurySeats = luxurySeats;
        }
        public class arrayTrain { 
            private Train_1[] arrTrain;// змінна массиву, що зберегає 
            // об'єкти
            private int nElems; // лічильник елементів масиву
  
            // Конструктор класу arrayCar
            public arrayTrain(int max){
                arrTrain=new Train_1[max]; // створення масиву об'єктів
                nElems=0; // лічильник обнуляється
            }
            // МЕТОД
//заповнення полів поточного об'єкта масива
public void Insert(String destination, int trainNumber, String departureTime,
int generalSeats, int coupeSeats, int reservedSeats, int luxurySeats ){
	if(nElems<arrTrain.length){
arrTrain[nElems] = new Train_1();
arrTrain[nElems].setDestination(destination);
arrTrain[nElems].setTrainNumber(trainNumber);
arrTrain[nElems].setDepartureTime(departureTime);
arrTrain[nElems].setGeneralSeats(generalSeats);
arrTrain[nElems].setCoupeSeats(coupeSeats);
arrTrain[nElems].setReservedSeats(reservedSeats);
arrTrain[nElems].setLuxurySeats(luxurySeats);
	}
    else
		System.out.println("Масив повністю заповнено");
nElems++; // лічильник збільшується на одиницю
}

// МЕТОД - вивід, по об'єктно, всіх полів на консоль
public void Display(){
	for (int i=0; i<nElems;i++) {
	System.out.println("Пункт призначення - "+arrTrain[i].getDestination());
	System.out.println("Номер поїзда - "+arrTrain[i].getTrainNumber());
    System.out.println("Час відправлення - "+arrTrain[i].getDepartureTime());
    System.out.println("Кількість загальних місць - "+arrTrain[i].getGeneralSeats());
    System.out.println("Кількість місць купе - "+arrTrain[i].getCoupeSeats());
    System.out.println("Кількість місць плацкарт - "+arrTrain[i].getReservedSeats());
    System.out.println("Кількість місць люкс - "+arrTrain[i].getLuxurySeats());
    System.out.println(arrTrain[i].toString()+" "+arrTrain[i].hashCode());

	}
}
}

public class Tr {
	public static void main(String[] args) {
		arrayTrain arTr;
		arTr = new arrayTrain(3);
        arTr.Insert("Kyiv", 1, "10:00", 20, 10, 50, 5);
        arTr.Insert("Lviv", 2, "12:00", 30, 20, 60, 6);
		arTr.Insert("Odessa", 3,"14:00", 40, 30, 70, 7);
		arTr.Display();
	}
}
            
            
}

