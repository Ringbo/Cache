diff --git a/core/src/main/java/io/undertow/util/SecureHashMap.java b/core/src/main/java/io/undertow/util/SecureHashMap.java
index 165f9ed..f9f531c 100644
--- a/core/src/main/java/io/undertow/util/SecureHashMap.java
+++ b/core/src/main/java/io/undertow/util/SecureHashMap.java
@@ -959,7 +959,7 @@
 
         public boolean hasNext() {
             while (next == null) {
-                if (tableIdx == table.array.length()) {
+                if (tableIdx == table.array.length() && tableIterator == null) {
                     return false;
                 }
                 if (tableIterator == null) {
@@ -1011,7 +1011,7 @@
 
         public boolean hasNext() {
             while (next == NONEXISTENT) {
-                if (tableIdx == table.array.length()) {
+                if (tableIdx == table.array.length() && tableIterator == null)  {
                     return false;
                 }
                 if (tableIterator == null) {
