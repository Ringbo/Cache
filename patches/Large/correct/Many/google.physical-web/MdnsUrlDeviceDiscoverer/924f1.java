diff --git a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/MdnsUrlDeviceDiscoverer.java b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/MdnsUrlDeviceDiscoverer.java
index 4a143d6..2e328e2 100644
--- a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/MdnsUrlDeviceDiscoverer.java
+++ b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/MdnsUrlDeviceDiscoverer.java
@@ -39,7 +39,7 @@
 
   public MdnsUrlDeviceDiscoverer(Context context) {
     mState = State.STOPPED;
-    resolver = new DiscoverResolver(context, MDNS_SERVICE_TYPE,
+    mResolver = new DiscoverResolver(context, MDNS_SERVICE_TYPE,
         new DiscoverResolver.Listener() {
       @Override
       public void onServicesChanged(Map<String, MDNSDiscover.Result> services) {
@@ -78,7 +78,7 @@
       return;
     }
     mState = State.WAITING;
-    resolver.start();
+    mResolver.start();
   }
 
   @Override
@@ -87,6 +87,6 @@
       return;
     }
     mState = State.WAITING;
-    resolver.stop();
+    mResolver.stop();
   }
 }
