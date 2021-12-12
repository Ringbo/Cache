diff --git a/src/main/java/org/joda/time/DateTimeUtils.java b/src/main/java/org/joda/time/DateTimeUtils.java
index 4059c54..391cafd 100644
--- a/src/main/java/org/joda/time/DateTimeUtils.java
+++ b/src/main/java/org/joda/time/DateTimeUtils.java
@@ -1,5 +1,5 @@
 /*
- *  Copyright 2001-2012 Stephen Colebourne
+ *  Copyright 2001-2013 Stephen Colebourne
  *
  *  Licensed under the Apache License, Version 2.0 (the "License");
  *  you may not use this file except in compliance with the License.
@@ -370,7 +370,7 @@
         for (int i = 0; i < partial.size(); i++) {
             DateTimeField loopField = partial.getField(i);
             if (i > 0) {
-                if (loopField.getRangeDurationField().getType() != lastType) {
+                if (loopField.getRangeDurationField() == null || loopField.getRangeDurationField().getType() != lastType) {
                     return false;
                 }
             }
