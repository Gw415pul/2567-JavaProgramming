package labsheet07;


public class SmartPhone {

 private String brand;
 private String model;
 private int storageCapacity;
 private static final int MAX_STORAGE_CAPACITY = 521; // ความจุสูงสุด 521 GB

 public SmartPhone() {
     this.brand = "Unknown";
     this.model = "Unknown";
     this.storageCapacity = 0;
 }

 public String getBrand() {
     return brand;
 }

 public String getModel() {
     return model;
 }

 public int getStorageCapacity() {
     return storageCapacity;
 }

 public void setBrand(String brand) {
     if (brand == null || brand.length() < 2) {
         System.out.println("Error: Brand must have at least 2 characters!");
     } else {
         this.brand = brand;
     }
 }

 public void setModel(String model) {
     if (model == null || model.length() < 2) {
         System.out.println("Error: Model must have at least 2 characters!");
     } else {
         this.model = model;
     }
 }

 public void setStorageCapacity(int storageCapacity) {
     if (storageCapacity < 1 || storageCapacity > 512) {
         System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
     } else {
         this.storageCapacity = storageCapacity;
     }
 }

 public void increaseStorage(int additionalStorage) {
     if (additionalStorage <= 0) {
         System.out.println("Error: Additional storage must be positive!");
     } else if (storageCapacity + additionalStorage > MAX_STORAGE_CAPACITY) {
         System.out.println("Error: Storage capacity cannot exceed " + MAX_STORAGE_CAPACITY + " GB!");
     } else {
         storageCapacity += additionalStorage;
         System.out.println("Storage successfully increased! New capacity: " + storageCapacity + " GB");
     }
 }

 public int getRemainingStorage(int usedStorage) {
     if (usedStorage < 0 || usedStorage > storageCapacity) {
         System.out.println("Error: Used storage must be between 0 and " + storageCapacity + " GB!");
         return -1; 
     }
     return storageCapacity - usedStorage;
 }

 public void printDetails() {
     System.out.println("Smartphone Details:");
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Storage Capacity: " + storageCapacity + " GB");
     System.out.println("----------------------------");
 }
}

