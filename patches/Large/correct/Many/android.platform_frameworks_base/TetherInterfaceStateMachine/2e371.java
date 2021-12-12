diff --git a/services/core/java/com/android/server/connectivity/tethering/TetherInterfaceStateMachine.java b/services/core/java/com/android/server/connectivity/tethering/TetherInterfaceStateMachine.java
index fbee86a..9e6b659 100644
--- a/services/core/java/com/android/server/connectivity/tethering/TetherInterfaceStateMachine.java
+++ b/services/core/java/com/android/server/connectivity/tethering/TetherInterfaceStateMachine.java
@@ -379,7 +379,7 @@
                     // that adding routes that already exist does not cause an
                     // error (EEXIST is silently ignored).
                     mNMService.addInterfaceToLocalNetwork(mIfaceName, toBeAdded);
-                } catch (RemoteException e) {
+                } catch (Exception e) {
                     mLog.e("Failed to add IPv6 routes to local table: " + e);
                 }
 
