diff --git a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMinus.java b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMinus.java
index b743bcf..40cac62 100644
--- a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMinus.java
+++ b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMinus.java
@@ -107,7 +107,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() - ((Double) arg).doubleValue());
                 }
             }
@@ -124,7 +124,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() - ((Float) arg).doubleValue());
                 }
             }
@@ -141,7 +141,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() - ((Long) arg).doubleValue());
                 }
             }
@@ -158,7 +158,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() - ((Integer) arg).intValue());
                 }
             }
@@ -175,7 +175,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() - ((Double) arg).doubleValue());
                 }
             }
@@ -192,7 +192,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() - ((Float) arg).doubleValue());
                 }
             }
@@ -209,7 +209,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() - ((Long) arg).doubleValue());
                 }
             }
@@ -226,7 +226,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() - ((Integer) arg).doubleValue());
                 }
             }
@@ -243,7 +243,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Long) receiver).doubleValue() - ((Double) arg).doubleValue());
                 }
             }
@@ -260,7 +260,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Long) receiver).doubleValue() - ((Float) arg).doubleValue());
                 }
             }
@@ -277,7 +277,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Long(((Long) receiver).longValue() - ((Long) arg).longValue());
                 }
             }
@@ -294,7 +294,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Long(((Long) receiver).longValue() - ((Integer) arg).longValue());
                 }
             }
@@ -311,7 +311,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Integer) receiver).doubleValue() - ((Double) arg).doubleValue());
                 }
             }
@@ -328,7 +328,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Integer) receiver).doubleValue() - ((Float) arg).doubleValue());
                 }
             }
@@ -345,7 +345,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Long(((Integer) receiver).longValue() - ((Long) arg).longValue());
                 }
             }
@@ -362,7 +362,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                   return new Integer(((Integer) receiver).intValue() - ((Integer) arg).intValue());
                 }
             }
