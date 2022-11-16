class Rental
{
   public static final int MINUTES_IN_HOUR = 60;
   public final int HOUR_RATE = 40;
   private String contractNumber;
   public String contactPhoneNumber;
   private int hours;
   private int extraMinutes;
   private double price;
   public int equipmentType;
   public static String EQUIPMENT_TYPE_NAMES[] = { "Personal Watercraft", "Pontoon Boat", "Rowboat", "Canoe", "Kayak", "Beach Chair", "Umbrella", "Other" };

   public Rental(String num, int minutes)
   {
      setContractNumber(num);
      setHoursAndMinutes(minutes);
   }

   public Rental()
   {
      this("A000", 0);
   }

   public void setContractNumber(String num)
   {
      contractNumber = num;
      if (((num.length() == 4) && ((Character.isAlphabetic(num.charAt(0))) && (Character.isDigit(num.charAt(1)))
            && (Character.isDigit(num.charAt(2))) && (Character.isDigit(num.charAt(3)))))) {
         contractNumber = num;
         contractNumber = Character.toUpperCase(num.charAt(0)) + num.substring(1);
      } else {
         contractNumber = "A000";
      }
   }

   public void setContactPhoneNumber(String phoneNum) {
      contactPhoneNumber = phoneNum;
      String phoneFormat = "";
      for (int i = 0; i < phoneNum.length(); i++) {
         if (Character.isDigit(phoneNum.charAt(i))) {
            phoneFormat += phoneNum.charAt(i);
         }
      }
      if (phoneNum.length() < 10 || phoneNum.length() > 10) {
         contactPhoneNumber = "0000000000";
      } else {
         contactPhoneNumber = phoneFormat;
      }
   }

   public String getContactPhone() {
      String phone;
      phone = "(" + contactPhoneNumber.substring(0, 3) + ") " + contactPhoneNumber.substring(3, 6) + "-"
            + contactPhoneNumber.substring(6, 10);
      return phone;
   }

   public void setHoursAndMinutes(int minutes)
   {
      hours = minutes / MINUTES_IN_HOUR;
      extraMinutes = minutes % MINUTES_IN_HOUR;
      if (extraMinutes <= HOUR_RATE)
         price = hours * HOUR_RATE + extraMinutes;
      else
         price = hours * HOUR_RATE + HOUR_RATE;
   }

   public void setEquipmentType(int equipmentTypeNum) {
      equipmentType = equipmentTypeNum;
      if (equipmentTypeNum < EQUIPMENT_TYPE_NAMES.length) {
         equipmentType = equipmentTypeNum;
      } else {
         equipmentType = EQUIPMENT_TYPE_NAMES.length;
      }
   }

   public String getEquipmentName(int i) {
      return EQUIPMENT_TYPE_NAMES[i];
   }

   public int getEquipmentType() {
      return equipmentType;
   }

   public String getContractNumber()
   {
      return contractNumber;
   }

   public int getHours()
   {
      return hours;
   }

   public int getExtraMinutes()
   {
      return extraMinutes;
   }

   public double getPrice()
   {
      return price;
   }
}