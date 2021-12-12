diff --git a/core/src/main/java/io/undertow/server/Connectors.java b/core/src/main/java/io/undertow/server/Connectors.java
index de8df27..273fbc8 100644
--- a/core/src/main/java/io/undertow/server/Connectors.java
+++ b/core/src/main/java/io/undertow/server/Connectors.java
@@ -194,7 +194,7 @@
             header.append("; Expires=");
             header.append(DateUtils.toDateString(cookie.getExpires()));
         }
-        if (cookie.getMaxAge() != null) {
+        if (cookie.getComment() != null) {
             if (cookie.getComment() != null && !cookie.getComment().isEmpty()) {
                 header.append("; Comment=");
                 header.append(cookie.getComment());
