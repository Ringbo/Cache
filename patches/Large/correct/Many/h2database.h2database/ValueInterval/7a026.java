diff --git a/h2/src/main/org/h2/value/ValueInterval.java b/h2/src/main/org/h2/value/ValueInterval.java
index ed4156a..9763599 100644
--- a/h2/src/main/org/h2/value/ValueInterval.java
+++ b/h2/src/main/org/h2/value/ValueInterval.java
@@ -296,7 +296,7 @@
         if (leading == 0L && remaining == 0L) {
             return this;
         }
-        return from(getQualifier(), !negative, -leading, remaining);
+        return from(getQualifier(), !negative, leading, remaining);
     }
 
 }
