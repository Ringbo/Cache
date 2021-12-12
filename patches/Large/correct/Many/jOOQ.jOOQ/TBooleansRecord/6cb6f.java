diff --git a/jOOQ-test/src/org/jooq/test/cubrid/generatedclasses/tables/records/TBooleansRecord.java b/jOOQ-test/src/org/jooq/test/cubrid/generatedclasses/tables/records/TBooleansRecord.java
index d421965..36be806 100644
--- a/jOOQ-test/src/org/jooq/test/cubrid/generatedclasses/tables/records/TBooleansRecord.java
+++ b/jOOQ-test/src/org/jooq/test/cubrid/generatedclasses/tables/records/TBooleansRecord.java
@@ -8,7 +8,7 @@
  */
 public class TBooleansRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TBooleansRecord> {
 
-	private static final long serialVersionUID = 1484299497;
+	private static final long serialVersionUID = 1787028237;
 
 	/**
 	 * An uncommented item
@@ -129,42 +129,42 @@
 	/**
 	 * An uncommented item
 	 */
-	public void setVcBoolean(byte[] value) {
+	public void setVcBoolean(java.lang.Boolean value) {
 		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBooleans.VC_BOOLEAN, value);
 	}
 
 	/**
 	 * An uncommented item
 	 */
-	public byte[] getVcBoolean() {
+	public java.lang.Boolean getVcBoolean() {
 		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBooleans.VC_BOOLEAN);
 	}
 
 	/**
 	 * An uncommented item
 	 */
-	public void setCBoolean(byte[] value) {
+	public void setCBoolean(java.lang.Boolean value) {
 		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBooleans.C_BOOLEAN, value);
 	}
 
 	/**
 	 * An uncommented item
 	 */
-	public byte[] getCBoolean() {
+	public java.lang.Boolean getCBoolean() {
 		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBooleans.C_BOOLEAN);
 	}
 
 	/**
 	 * An uncommented item
 	 */
-	public void setNBoolean(byte[] value) {
+	public void setNBoolean(java.lang.Boolean value) {
 		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBooleans.N_BOOLEAN, value);
 	}
 
 	/**
 	 * An uncommented item
 	 */
-	public byte[] getNBoolean() {
+	public java.lang.Boolean getNBoolean() {
 		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBooleans.N_BOOLEAN);
 	}
 
