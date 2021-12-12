diff --git a/jOOQ-test/src/org/jooq/test/sqlserver/generatedclasses/tables/records/TDatesRecord.java b/jOOQ-test/src/org/jooq/test/sqlserver/generatedclasses/tables/records/TDatesRecord.java
index 8434b90..44957bb 100644
--- a/jOOQ-test/src/org/jooq/test/sqlserver/generatedclasses/tables/records/TDatesRecord.java
+++ b/jOOQ-test/src/org/jooq/test/sqlserver/generatedclasses/tables/records/TDatesRecord.java
@@ -8,7 +8,7 @@
  */
 public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> {
 
-	private static final long serialVersionUID = -935352307;
+	private static final long serialVersionUID = -560600961;
 
 	/**
 	 * An uncommented item
@@ -58,21 +58,15 @@
 
 	/**
 	 * An uncommented item
-	 * 
-	 * The SQL type of this item (timestamp, ) could not be mapped.<br/>
-	 * Deserialising this field might not work!
 	 */
-	public void setTs(java.lang.Object value) {
+	public void setTs(java.sql.Timestamp value) {
 		setValue(org.jooq.test.sqlserver.generatedclasses.tables.TDates.T_DATES.TS, value);
 	}
 
 	/**
 	 * An uncommented item
-	 * 
-	 * The SQL type of this item (timestamp, ) could not be mapped.<br/>
-	 * Deserialising this field might not work!
 	 */
-	public java.lang.Object getTs() {
+	public java.sql.Timestamp getTs() {
 		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.TDates.T_DATES.TS);
 	}
 
