diff --git a/core/java/android/net/ScoredNetwork.java b/core/java/android/net/ScoredNetwork.java
index c86c25a..d396b50 100644
--- a/core/java/android/net/ScoredNetwork.java
+++ b/core/java/android/net/ScoredNetwork.java
@@ -219,7 +219,8 @@
                 "networkKey=" + networkKey +
                 ", rssiCurve=" + rssiCurve +
                 ", meteredHint=" + meteredHint);
-        if (attributes != null) {
+        // calling isEmpty will unparcel the bundle so its contents can be converted to a string
+        if (attributes != null && !attributes.isEmpty()) {
             out.append(", attributes=" + attributes);
         }
         out.append('}');
