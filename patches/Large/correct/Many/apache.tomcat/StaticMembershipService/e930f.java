diff --git a/java/org/apache/catalina/tribes/membership/StaticMembershipService.java b/java/org/apache/catalina/tribes/membership/StaticMembershipService.java
index 37b42d9..d3d91a1 100644
--- a/java/org/apache/catalina/tribes/membership/StaticMembershipService.java
+++ b/java/org/apache/catalina/tribes/membership/StaticMembershipService.java
@@ -237,7 +237,7 @@
         // find local member from static members
         for (StaticMember staticMember : this.staticMembers) {
             if (Arrays.equals(InetAddress.getByName(listenHost).getAddress(), staticMember.getHost())
-                    && Integer.valueOf(listenPort) == staticMember.getPort()) {
+                    && Integer.parseInt(listenPort) == staticMember.getPort()) {
                 this.localMember = staticMember;
                 break;
             }
