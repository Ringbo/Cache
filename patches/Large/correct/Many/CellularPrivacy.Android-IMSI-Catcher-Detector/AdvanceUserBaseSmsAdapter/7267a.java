diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseSmsAdapter.java b/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseSmsAdapter.java
index 15a36b0..e4a3e4f 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseSmsAdapter.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseSmsAdapter.java
@@ -45,7 +45,7 @@
 	public View getView(int position, View convertView, ViewGroup parent) {
 		ViewHolder holder;
 		if (convertView == null) {
-			convertView = l_Inflater.inflate(R.layout.adv_user_sms_listview, parent);
+			convertView = l_Inflater.inflate(R.layout.adv_user_sms_listview, parent, false);
 			holder = new ViewHolder();
             holder.smsd_timestamp = (TextView)convertView.findViewById(R.id.tv_adv_smsdata_timestamp);
             holder.smsd_smstype = (TextView) convertView.findViewById(R.id.tv_adv_smsdata_smstype);
