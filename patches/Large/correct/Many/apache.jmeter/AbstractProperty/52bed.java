diff --git a/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java b/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java
index 5cd6559..22a6824 100644
--- a/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java
+++ b/src/core/org/apache/jmeter/testelement/property/AbstractProperty.java
@@ -108,7 +108,7 @@
     @Override
     public int getIntValue() {
         String val = getStringValue();
-        if (val == null) {
+        if (val == null || val.length()==0) {
             return 0;
         }
         try {
@@ -126,7 +126,7 @@
     @Override
     public long getLongValue() {
         String val = getStringValue();
-        if (val == null) {
+        if (val == null || val.length()==0) {
             return 0;
         }
         try {
@@ -144,7 +144,7 @@
     @Override
     public double getDoubleValue() {
         String val = getStringValue();
-        if (val == null) {
+        if (val == null || val.length()==0) {
             return 0;
         }
         try {
@@ -163,7 +163,7 @@
     @Override
     public float getFloatValue() {
         String val = getStringValue();
-        if (val == null) {
+        if (val == null || val.length()==0) {
             return 0;
         }
         try {
@@ -182,7 +182,7 @@
     @Override
     public boolean getBooleanValue() {
         String val = getStringValue();
-        if (val == null) {
+        if (val == null || val.length()==0) {
             return false;
         }
         return Boolean.parseBoolean(val);
