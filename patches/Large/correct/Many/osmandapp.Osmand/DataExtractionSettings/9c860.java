diff --git a/DataExtractionOSM/src/net/osmand/swing/DataExtractionSettings.java b/DataExtractionOSM/src/net/osmand/swing/DataExtractionSettings.java
index 0663250..5dd17c8 100644
--- a/DataExtractionOSM/src/net/osmand/swing/DataExtractionSettings.java
+++ b/DataExtractionOSM/src/net/osmand/swing/DataExtractionSettings.java
@@ -154,11 +154,11 @@
 	}
 	
 	public String getCityAdminLevel(){
-		return preferences.getString("cityAdminLevel", "8");
+		return preferences.get("cityAdminLevel", "8");
 	}
 	
 	public void setCityAdminLevel(String s){
-		preferences.putString("cityAdminLevel", s);
+		preferences.put("cityAdminLevel", s);
 	}
 	
 	public boolean isSupressWarningsForDuplicatedId(){
