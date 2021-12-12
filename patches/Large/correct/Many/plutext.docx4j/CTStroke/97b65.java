diff --git a/src/main/java/org/docx4j/vml/CTStroke.java b/src/main/java/org/docx4j/vml/CTStroke.java
index 549b68c..a4ab327 100644
--- a/src/main/java/org/docx4j/vml/CTStroke.java
+++ b/src/main/java/org/docx4j/vml/CTStroke.java
@@ -92,7 +92,7 @@
     @XmlAttribute(name = "linestyle")
     protected STStrokeLineStyle linestyle;
     @XmlAttribute(name = "miterlimit")
-    protected BigDecimal miterlimit;
+    protected String miterlimit;
     @XmlAttribute(name = "joinstyle")
     protected STStrokeJoinStyle joinstyle;
     @XmlAttribute(name = "endcap")
@@ -412,7 +412,7 @@
      *     {@link BigDecimal }
      *     
      */
-    public BigDecimal getMiterlimit() {
+    public String getMiterlimit() {
         return miterlimit;
     }
 
@@ -424,7 +424,7 @@
      *     {@link BigDecimal }
      *     
      */
-    public void setMiterlimit(BigDecimal value) {
+    public void setMiterlimit(String value) {
         this.miterlimit = value;
     }
 
