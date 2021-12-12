diff --git a/src/main/java/org/docx4j/vml/officedrawing/CTStrokeChild.java b/src/main/java/org/docx4j/vml/officedrawing/CTStrokeChild.java
index 71b3ca7..e8e47c0 100644
--- a/src/main/java/org/docx4j/vml/officedrawing/CTStrokeChild.java
+++ b/src/main/java/org/docx4j/vml/officedrawing/CTStrokeChild.java
@@ -102,7 +102,7 @@
     @XmlAttribute(name = "linestyle")
     protected STStrokeLineStyle linestyle;
     @XmlAttribute(name = "miterlimit")
-    protected BigDecimal miterlimit;
+    protected String miterlimit;
     @XmlAttribute(name = "joinstyle")
     protected STStrokeJoinStyle joinstyle;
     @XmlAttribute(name = "endcap")
@@ -298,7 +298,7 @@
      *     {@link BigDecimal }
      *     
      */
-    public BigDecimal getMiterlimit() {
+    public String getMiterlimit() {
         return miterlimit;
     }
 
@@ -310,7 +310,7 @@
      *     {@link BigDecimal }
      *     
      */
-    public void setMiterlimit(BigDecimal value) {
+    public void setMiterlimit(String value) {
         this.miterlimit = value;
     }
 
