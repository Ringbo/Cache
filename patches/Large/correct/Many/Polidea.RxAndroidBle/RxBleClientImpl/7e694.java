diff --git a/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java b/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java
index 405eb00..561fee9 100644
--- a/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java
+++ b/rxandroidble/src/main/java/com/polidea/rxandroidble/RxBleClientImpl.java
@@ -86,7 +86,7 @@
     }
 
     private boolean checkIfLocationPermissionIsGrantedIfRequired() {
-        return locationServicesStatus.isLocationProviderEnabled() && !locationServicesStatus.isLocationPermissionApproved();
+        return locationServicesStatus.isLocationProviderRequired() && !locationServicesStatus.isLocationPermissionApproved();
     }
 
     private <T> Observable<T> bluetoothAdapterOffExceptionObservable() {
