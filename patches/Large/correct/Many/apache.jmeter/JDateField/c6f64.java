diff --git a/src/core/org/apache/jmeter/gui/util/JDateField.java b/src/core/org/apache/jmeter/gui/util/JDateField.java
index 37dbbc8..af7bf77 100644
--- a/src/core/org/apache/jmeter/gui/util/JDateField.java
+++ b/src/core/org/apache/jmeter/gui/util/JDateField.java
@@ -196,7 +196,7 @@
             try {
                 dateFormat.parse(getText());
             } catch (ParseException e1) {
-                requestFocus();
+                requestFocusInWindow();
             }
         }
     }
