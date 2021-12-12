diff --git a/media/java/android/media/tv/TvContract.java b/media/java/android/media/tv/TvContract.java
index 7bf69c0..9739319 100644
--- a/media/java/android/media/tv/TvContract.java
+++ b/media/java/android/media/tv/TvContract.java
@@ -283,7 +283,7 @@
      * @param name The {@link ComponentName} of the TV input service to build ID for.
      * @return the ID for the given TV input service.
      */
-    public static final String buildInputId(ComponentName name) {
+    public static String buildInputId(ComponentName name) {
         return name.flattenToShortString();
     }
 
@@ -292,7 +292,7 @@
      *
      * @param channelId The ID of the channel to point to.
      */
-    public static final Uri buildChannelUri(long channelId) {
+    public static Uri buildChannelUri(long channelId) {
         return ContentUris.withAppendedId(Channels.CONTENT_URI, channelId);
     }
 
@@ -302,7 +302,7 @@
      * @param inputId The ID of the pass-through input to build a channels URI for.
      * @see TvInputInfo#isPassthroughInput()
      */
-    public static final Uri buildChannelUriForPassthroughInput(String inputId) {
+    public static Uri buildChannelUriForPassthroughInput(String inputId) {
         return new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY)
                 .appendPath(PATH_PASSTHROUGH).appendPath(inputId).build();
     }
@@ -312,7 +312,7 @@
      *
      * @param channelId The ID of the channel whose logo is pointed to.
      */
-    public static final Uri buildChannelLogoUri(long channelId) {
+    public static Uri buildChannelLogoUri(long channelId) {
         return buildChannelLogoUri(buildChannelUri(channelId));
     }
 
@@ -321,7 +321,7 @@
      *
      * @param channelUri The URI of the channel whose logo is pointed to.
      */
-    public static final Uri buildChannelLogoUri(Uri channelUri) {
+    public static Uri buildChannelLogoUri(Uri channelUri) {
         if (!isChannelUriForTunerInput(channelUri)) {
             throw new IllegalArgumentException("Not a channel: " + channelUri);
         }
@@ -334,7 +334,7 @@
      * @param inputId The ID of the TV input to build a channels URI for. If {@code null}, builds a
      *            URI for all the TV inputs.
      */
-    public static final Uri buildChannelsUriForInput(@Nullable String inputId) {
+    public static Uri buildChannelsUriForInput(@Nullable String inputId) {
         return buildChannelsUriForInput(inputId, false);
     }
 
@@ -349,7 +349,7 @@
      * @hide
      */
     @SystemApi
-    public static final Uri buildChannelsUriForInput(@Nullable String inputId,
+    public static Uri buildChannelsUriForInput(@Nullable String inputId,
             boolean browsableOnly) {
         Uri.Builder builder = Channels.CONTENT_URI.buildUpon();
         if (inputId != null) {
@@ -372,7 +372,7 @@
      * @hide
      */
     @SystemApi
-    public static final Uri buildChannelsUriForInput(@Nullable String inputId,
+    public static Uri buildChannelsUriForInput(@Nullable String inputId,
             @Nullable String genre, boolean browsableOnly) {
         if (genre == null) {
             return buildChannelsUriForInput(inputId, browsableOnly);
@@ -389,7 +389,7 @@
      *
      * @param programId The ID of the program to point to.
      */
-    public static final Uri buildProgramUri(long programId) {
+    public static Uri buildProgramUri(long programId) {
         return ContentUris.withAppendedId(Programs.CONTENT_URI, programId);
     }
 
@@ -398,7 +398,7 @@
      *
      * @param channelId The ID of the channel to return programs for.
      */
-    public static final Uri buildProgramsUriForChannel(long channelId) {
+    public static Uri buildProgramsUriForChannel(long channelId) {
         return Programs.CONTENT_URI.buildUpon()
                 .appendQueryParameter(PARAM_CHANNEL, String.valueOf(channelId)).build();
     }
@@ -408,7 +408,7 @@
      *
      * @param channelUri The URI of the channel to return programs for.
      */
-    public static final Uri buildProgramsUriForChannel(Uri channelUri) {
+    public static Uri buildProgramsUriForChannel(Uri channelUri) {
         if (!isChannelUriForTunerInput(channelUri)) {
             throw new IllegalArgumentException("Not a channel: " + channelUri);
         }
@@ -425,7 +425,7 @@
      * @param endTime The end time used to filter programs. The returned programs should have
      *            {@link Programs#COLUMN_START_TIME_UTC_MILLIS} that is less than this time.
      */
-    public static final Uri buildProgramsUriForChannel(long channelId, long startTime,
+    public static Uri buildProgramsUriForChannel(long channelId, long startTime,
             long endTime) {
         Uri uri = buildProgramsUriForChannel(channelId);
         return uri.buildUpon().appendQueryParameter(PARAM_START_TIME, String.valueOf(startTime))
@@ -442,7 +442,7 @@
      * @param endTime The end time used to filter programs. The returned programs should have
      *            {@link Programs#COLUMN_START_TIME_UTC_MILLIS} that is less than this time.
      */
-    public static final Uri buildProgramsUriForChannel(Uri channelUri, long startTime,
+    public static Uri buildProgramsUriForChannel(Uri channelUri, long startTime,
             long endTime) {
         if (!isChannelUriForTunerInput(channelUri)) {
             throw new IllegalArgumentException("Not a channel: " + channelUri);
@@ -455,7 +455,7 @@
      *
      * @param recordedProgramId The ID of the recorded program to point to.
      */
-    public static final Uri buildRecordedProgramUri(long recordedProgramId) {
+    public static Uri buildRecordedProgramUri(long recordedProgramId) {
         return ContentUris.withAppendedId(RecordedPrograms.CONTENT_URI, recordedProgramId);
     }
 
@@ -464,7 +464,7 @@
      *
      * @param previewProgramId The ID of the preview program to point to.
      */
-    public static final Uri buildPreviewProgramUri(long previewProgramId) {
+    public static Uri buildPreviewProgramUri(long previewProgramId) {
         return ContentUris.withAppendedId(PreviewPrograms.CONTENT_URI, previewProgramId);
     }
 
@@ -473,7 +473,7 @@
      *
      * @param channelId The ID of the channel to return preview programs for.
      */
-    public static final Uri buildPreviewProgramsUriForChannel(long channelId) {
+    public static Uri buildPreviewProgramsUriForChannel(long channelId) {
         return PreviewPrograms.CONTENT_URI.buildUpon()
                 .appendQueryParameter(PARAM_CHANNEL, String.valueOf(channelId)).build();
     }
@@ -483,7 +483,7 @@
      *
      * @param channelUri The URI of the channel to return preview programs for.
      */
-    public static final Uri buildPreviewProgramsUriForChannel(Uri channelUri) {
+    public static Uri buildPreviewProgramsUriForChannel(Uri channelUri) {
         if (!isChannelUriForTunerInput(channelUri)) {
             throw new IllegalArgumentException("Not a channel: " + channelUri);
         }
@@ -495,7 +495,7 @@
      *
      * @param watchNextProgramId The ID of the watch next program to point to.
      */
-    public static final Uri buildWatchNextProgramUri(long watchNextProgramId) {
+    public static Uri buildWatchNextProgramUri(long watchNextProgramId) {
         return ContentUris.withAppendedId(WatchNextPrograms.CONTENT_URI, watchNextProgramId);
     }
 
@@ -505,7 +505,7 @@
      * @param watchedProgramId The ID of the watched program to point to.
      * @hide
      */
-    public static final Uri buildWatchedProgramUri(long watchedProgramId) {
+    public static Uri buildWatchedProgramUri(long watchedProgramId) {
         return ContentUris.withAppendedId(WatchedPrograms.CONTENT_URI, watchedProgramId);
     }
 
@@ -522,28 +522,28 @@
     /**
      * Returns {@code true}, if {@code uri} is a channel URI.
      */
-    public static final boolean isChannelUri(Uri uri) {
+    public static boolean isChannelUri(Uri uri) {
         return isChannelUriForTunerInput(uri) || isChannelUriForPassthroughInput(uri);
     }
 
     /**
      * Returns {@code true}, if {@code uri} is a channel URI for a tuner input.
      */
-    public static final boolean isChannelUriForTunerInput(Uri uri) {
+    public static boolean isChannelUriForTunerInput(Uri uri) {
         return isTvUri(uri) && isTwoSegmentUriStartingWith(uri, PATH_CHANNEL);
     }
 
     /**
      * Returns {@code true}, if {@code uri} is a channel URI for a pass-through input.
      */
-    public static final boolean isChannelUriForPassthroughInput(Uri uri) {
+    public static boolean isChannelUriForPassthroughInput(Uri uri) {
         return isTvUri(uri) && isTwoSegmentUriStartingWith(uri, PATH_PASSTHROUGH);
     }
 
     /**
      * Returns {@code true}, if {@code uri} is a program URI.
      */
-    public static final boolean isProgramUri(Uri uri) {
+    public static boolean isProgramUri(Uri uri) {
         return isTvUri(uri) && isTwoSegmentUriStartingWith(uri, PATH_PROGRAM);
     }
 
@@ -580,7 +580,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_TITLE = "title";
+        String COLUMN_TITLE = "title";
 
         /**
          * The season display number of this TV program for episodic TV shows.
@@ -592,7 +592,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_SEASON_DISPLAY_NUMBER = "season_display_number";
+        String COLUMN_SEASON_DISPLAY_NUMBER = "season_display_number";
 
         /**
          * The title of the season for this TV program for episodic TV shows.
@@ -608,7 +608,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_SEASON_TITLE = "season_title";
+        String COLUMN_SEASON_TITLE = "season_title";
 
         /**
          * The episode display number of this TV program for episodic TV shows.
@@ -620,7 +620,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_EPISODE_DISPLAY_NUMBER = "episode_display_number";
+        String COLUMN_EPISODE_DISPLAY_NUMBER = "episode_display_number";
 
         /**
          * The episode title of this TV program for episodic TV shows.
@@ -629,7 +629,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_EPISODE_TITLE = "episode_title";
+        String COLUMN_EPISODE_TITLE = "episode_title";
 
         /**
          * The comma-separated canonical genre string of this TV program.
@@ -643,7 +643,7 @@
          * @see Genres#encode
          * @see Genres#decode
          */
-        public static final String COLUMN_CANONICAL_GENRE = "canonical_genre";
+        String COLUMN_CANONICAL_GENRE = "canonical_genre";
 
         /**
          * The short description of this TV program that is displayed to the user by default.
@@ -652,7 +652,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_SHORT_DESCRIPTION = "short_description";
+        String COLUMN_SHORT_DESCRIPTION = "short_description";
 
         /**
          * The detailed, lengthy description of this TV program that is displayed only when the user
@@ -663,7 +663,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_LONG_DESCRIPTION = "long_description";
+        String COLUMN_LONG_DESCRIPTION = "long_description";
 
         /**
          * The width of the video for this TV program, in the unit of pixels.
@@ -675,7 +675,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_VIDEO_WIDTH = "video_width";
+        String COLUMN_VIDEO_WIDTH = "video_width";
 
         /**
          * The height of the video for this TV program, in the unit of pixels.
@@ -687,7 +687,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_VIDEO_HEIGHT = "video_height";
+        String COLUMN_VIDEO_HEIGHT = "video_height";
 
         /**
          * The comma-separated audio languages of this TV program.
@@ -697,7 +697,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_AUDIO_LANGUAGE = "audio_language";
+        String COLUMN_AUDIO_LANGUAGE = "audio_language";
 
         /**
          * The comma-separated content ratings of this TV program.
@@ -714,7 +714,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_CONTENT_RATING = "content_rating";
+        String COLUMN_CONTENT_RATING = "content_rating";
 
         /**
          * The URI for the poster art of this TV program.
@@ -732,7 +732,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_POSTER_ART_URI = "poster_art_uri";
+        String COLUMN_POSTER_ART_URI = "poster_art_uri";
 
         /**
          * The URI for the thumbnail of this TV program.
@@ -754,7 +754,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_THUMBNAIL_URI = "thumbnail_uri";
+        String COLUMN_THUMBNAIL_URI = "thumbnail_uri";
 
         /**
          * The flag indicating whether this TV program is searchable or not.
@@ -769,7 +769,7 @@
          *
          * <p>Type: INTEGER (boolean)
          */
-        public static final String COLUMN_SEARCHABLE = "searchable";
+        String COLUMN_SEARCHABLE = "searchable";
 
         /**
          * Internal data used by individual TV input services.
@@ -779,7 +779,7 @@
          *
          * <p>Type: BLOB
          */
-        public static final String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
+        String COLUMN_INTERNAL_PROVIDER_DATA = "internal_provider_data";
 
         /**
          * Internal integer flag used by individual TV input services.
@@ -789,7 +789,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
+        String COLUMN_INTERNAL_PROVIDER_FLAG1 = "internal_provider_flag1";
 
         /**
          * Internal integer flag used by individual TV input services.
@@ -799,7 +799,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
+        String COLUMN_INTERNAL_PROVIDER_FLAG2 = "internal_provider_flag2";
 
         /**
          * Internal integer flag used by individual TV input services.
@@ -809,7 +809,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
+        String COLUMN_INTERNAL_PROVIDER_FLAG3 = "internal_provider_flag3";
 
         /**
          * Internal integer flag used by individual TV input services.
@@ -819,7 +819,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
+        String COLUMN_INTERNAL_PROVIDER_FLAG4 = "internal_provider_flag4";
 
         /**
          * The version number of this row entry used by TV input services.
@@ -831,7 +831,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_VERSION_NUMBER = "version_number";
+        String COLUMN_VERSION_NUMBER = "version_number";
     }
 
     /**
@@ -862,84 +862,84 @@
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_MOVIE = "TYPE_MOVIE";
+        String TYPE_MOVIE = "TYPE_MOVIE";
 
         /**
          * The program type for TV series.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_TV_SERIES = "TYPE_TV_SERIES";
+        String TYPE_TV_SERIES = "TYPE_TV_SERIES";
 
         /**
          * The program type for TV season.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_TV_SEASON = "TYPE_TV_SEASON";
+        String TYPE_TV_SEASON = "TYPE_TV_SEASON";
 
         /**
          * The program type for TV episode.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_TV_EPISODE = "TYPE_TV_EPISODE";
+        String TYPE_TV_EPISODE = "TYPE_TV_EPISODE";
 
         /**
          * The program type for clip.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_CLIP = "TYPE_CLIP";
+        String TYPE_CLIP = "TYPE_CLIP";
 
         /**
          * The program type for event.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_EVENT = "TYPE_EVENT";
+        String TYPE_EVENT = "TYPE_EVENT";
 
         /**
          * The program type for channel.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_CHANNEL = "TYPE_CHANNEL";
+        String TYPE_CHANNEL = "TYPE_CHANNEL";
 
         /**
          * The program type for track.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_TRACK = "TYPE_TRACK";
+        String TYPE_TRACK = "TYPE_TRACK";
 
         /**
          * The program type for album.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_ALBUM = "TYPE_ALBUM";
+        String TYPE_ALBUM = "TYPE_ALBUM";
 
         /**
          * The program type for artist.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_ARTIST = "TYPE_ARTIST";
+        String TYPE_ARTIST = "TYPE_ARTIST";
 
         /**
          * The program type for playlist.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_PLAYLIST = "TYPE_PLAYLIST";
+        String TYPE_PLAYLIST = "TYPE_PLAYLIST";
 
         /**
          * The program type for station.
          *
          * @see #COLUMN_TYPE
          */
-        public static final String TYPE_STATION = "TYPE_STATION";
+        String TYPE_STATION = "TYPE_STATION";
 
         /** @hide */
         @StringDef({
@@ -957,7 +957,7 @@
          * @see #COLUMN_POSTER_ART_ASPECT_RATIO
          * @see #COLUMN_THUMBNAIL_ASPECT_RATIO
          */
-        public static final String ASPECT_RATIO_16_9 = "ASPECT_RATIO_16_9";
+        String ASPECT_RATIO_16_9 = "ASPECT_RATIO_16_9";
 
         /**
          * The aspect ratio for 3:2.
@@ -965,7 +965,7 @@
          * @see #COLUMN_POSTER_ART_ASPECT_RATIO
          * @see #COLUMN_THUMBNAIL_ASPECT_RATIO
          */
-        public static final String ASPECT_RATIO_3_2 = "ASPECT_RATIO_3_2";
+        String ASPECT_RATIO_3_2 = "ASPECT_RATIO_3_2";
 
         /**
          * The aspect ratio for 1:1.
@@ -973,7 +973,7 @@
          * @see #COLUMN_POSTER_ART_ASPECT_RATIO
          * @see #COLUMN_THUMBNAIL_ASPECT_RATIO
          */
-        public static final String ASPECT_RATIO_1_1 = "ASPECT_RATIO_1_1";
+        String ASPECT_RATIO_1_1 = "ASPECT_RATIO_1_1";
 
         /**
          * The aspect ratio for 2:3.
@@ -981,7 +981,7 @@
          * @see #COLUMN_POSTER_ART_ASPECT_RATIO
          * @see #COLUMN_THUMBNAIL_ASPECT_RATIO
          */
-        public static final String ASPECT_RATIO_2_3 = "ASPECT_RATIO_2_3";
+        String ASPECT_RATIO_2_3 = "ASPECT_RATIO_2_3";
 
         /** @hide */
         @StringDef({
@@ -997,14 +997,14 @@
          *
          * @see #COLUMN_AVAILABILITY
          */
-        public static final String AVAILABILITY_AVAILABLE = "AVAILABILITY_AVAILABLE";
+        String AVAILABILITY_AVAILABLE = "AVAILABILITY_AVAILABLE";
 
         /**
          * The availability for "free with subscription".
          *
          * @see #COLUMN_AVAILABILITY
          */
-        public static final String AVAILABILITY_FREE_WITH_SUBSCRIPTION =
+        String AVAILABILITY_FREE_WITH_SUBSCRIPTION =
                 "AVAILABILITY_FREE_WITH_SUBSCRIPTION";
 
         /**
@@ -1013,7 +1013,7 @@
          *
          * @see #COLUMN_AVAILABILITY
          */
-        public static final String AVAILABILITY_PAID_CONTENT = "AVAILABILITY_PAID_CONTENT";
+        String AVAILABILITY_PAID_CONTENT = "AVAILABILITY_PAID_CONTENT";
 
         /** @hide */
         @StringDef({
@@ -1033,49 +1033,49 @@
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_LISTENS = "INTERACTION_TYPE_LISTENS";
+        String INTERACTION_TYPE_LISTENS = "INTERACTION_TYPE_LISTENS";
 
         /**
          * The interaction type for "followers".
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_FOLLOWERS = "INTERACTION_TYPE_FOLLOWERS";
+        String INTERACTION_TYPE_FOLLOWERS = "INTERACTION_TYPE_FOLLOWERS";
 
         /**
          * The interaction type for "fans".
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_FANS = "INTERACTION_TYPE_FANS";
+        String INTERACTION_TYPE_FANS = "INTERACTION_TYPE_FANS";
 
         /**
          * The interaction type for "likes".
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_LIKES = "INTERACTION_TYPE_LIKES";
+        String INTERACTION_TYPE_LIKES = "INTERACTION_TYPE_LIKES";
 
         /**
          * The interaction type for "thumbs".
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_THUMBS = "INTERACTION_TYPE_THUMBS";
+        String INTERACTION_TYPE_THUMBS = "INTERACTION_TYPE_THUMBS";
 
         /**
          * The interaction type for "views".
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_VIEWS = "INTERACTION_TYPE_VIEWS";
+        String INTERACTION_TYPE_VIEWS = "INTERACTION_TYPE_VIEWS";
 
         /**
          * The interaction type for "viewers".
          *
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String INTERACTION_TYPE_VIEWERS = "INTERACTION_TYPE_VIEWERS";
+        String INTERACTION_TYPE_VIEWERS = "INTERACTION_TYPE_VIEWERS";
 
         /** @hide */
         @StringDef({
@@ -1091,14 +1091,14 @@
          *
          * @see #COLUMN_REVIEW_RATING_STYLE
          */
-        public static final String REVIEW_RATING_STYLE_STARS = "REVIEW_RATING_STYLE_STARS";
+        String REVIEW_RATING_STYLE_STARS = "REVIEW_RATING_STYLE_STARS";
 
         /**
          * The review rating style for thumbs-up and thumbs-down rating.
          *
          * @see #COLUMN_REVIEW_RATING_STYLE
          */
-        public static final String REVIEW_RATING_STYLE_THUMBS_UP_DOWN =
+        String REVIEW_RATING_STYLE_THUMBS_UP_DOWN =
                 "REVIEW_RATING_STYLE_THUMBS_UP_DOWN";
 
         /**
@@ -1106,7 +1106,7 @@
          *
          * @see #COLUMN_REVIEW_RATING_STYLE
          */
-        public static final String REVIEW_RATING_STYLE_PERCENTAGE =
+        String REVIEW_RATING_STYLE_PERCENTAGE =
                 "REVIEW_RATING_STYLE_PERCENTAGE";
 
         /**
@@ -1131,7 +1131,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_TYPE = "type";
+        String COLUMN_TYPE = "type";
 
         /**
          * The aspect ratio of the poster art for this TV program.
@@ -1144,7 +1144,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_POSTER_ART_ASPECT_RATIO = "poster_art_aspect_ratio";
+        String COLUMN_POSTER_ART_ASPECT_RATIO = "poster_art_aspect_ratio";
 
         /**
          * The aspect ratio of the thumbnail for this TV program.
@@ -1157,7 +1157,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_THUMBNAIL_ASPECT_RATIO = "poster_thumbnail_aspect_ratio";
+        String COLUMN_THUMBNAIL_ASPECT_RATIO = "poster_thumbnail_aspect_ratio";
 
         /**
          * The URI for the logo of this TV program.
@@ -1178,7 +1178,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_LOGO_URI = "logo_uri";
+        String COLUMN_LOGO_URI = "logo_uri";
 
         /**
          * The availability of this TV program.
@@ -1190,7 +1190,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_AVAILABILITY = "availability";
+        String COLUMN_AVAILABILITY = "availability";
 
         /**
          * The starting price of this TV program.
@@ -1201,7 +1201,7 @@
          * <p>Type: TEXT
          * @see #COLUMN_OFFER_PRICE
          */
-        public static final String COLUMN_STARTING_PRICE = "starting_price";
+        String COLUMN_STARTING_PRICE = "starting_price";
 
         /**
          * The offer price of this TV program.
@@ -1212,7 +1212,7 @@
          * <p>Type: TEXT
          * @see #COLUMN_STARTING_PRICE
          */
-        public static final String COLUMN_OFFER_PRICE = "offer_price";
+        String COLUMN_OFFER_PRICE = "offer_price";
 
         /**
          * The release date of this TV program.
@@ -1221,7 +1221,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_RELEASE_DATE = "release_date";
+        String COLUMN_RELEASE_DATE = "release_date";
 
         /**
          * The count of the items included in this TV program.
@@ -1231,7 +1231,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_ITEM_COUNT = "item_count";
+        String COLUMN_ITEM_COUNT = "item_count";
 
         /**
          * The flag indicating whether this TV program is live or not.
@@ -1242,7 +1242,7 @@
          *
          * <p>Type: INTEGER (boolean)
          */
-        public static final String COLUMN_LIVE = "live";
+        String COLUMN_LIVE = "live";
 
         /**
          * The internal ID used by individual TV input services.
@@ -1254,7 +1254,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_INTERNAL_PROVIDER_ID = "internal_provider_id";
+        String COLUMN_INTERNAL_PROVIDER_ID = "internal_provider_id";
 
         /**
          * The URI for the preview video.
@@ -1273,7 +1273,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_PREVIEW_VIDEO_URI = "preview_video_uri";
+        String COLUMN_PREVIEW_VIDEO_URI = "preview_video_uri";
 
         /**
          * The last playback position (in milliseconds) of the preview video.
@@ -1284,7 +1284,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_LAST_PLAYBACK_POSITION_MILLIS =
+        String COLUMN_LAST_PLAYBACK_POSITION_MILLIS =
                 "last_playback_position_millis";
 
         /**
@@ -1296,7 +1296,7 @@
          *
          * <p>Type: INTEGER
          */
-        public static final String COLUMN_DURATION_MILLIS = "duration_millis";
+        String COLUMN_DURATION_MILLIS = "duration_millis";
 
         /**
          * The intent URI which is launched when the preview video is selected.
@@ -1309,7 +1309,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_APP_LINK_INTENT_URI =
+        String COLUMN_APP_LINK_INTENT_URI =
                 "app_link_intent_uri";
 
         /**
@@ -1322,7 +1322,7 @@
          * <p>Type: INTEGER (boolean)
          * @see Channels#COLUMN_TRANSIENT
          */
-        public static final String COLUMN_TRANSIENT = "transient";
+        String COLUMN_TRANSIENT = "transient";
 
         /**
          * The type of interaction for this TV program.
@@ -1339,7 +1339,7 @@
          * <p>Type: TEXT
          * @see #COLUMN_INTERACTION_COUNT
          */
-        public static final String COLUMN_INTERACTION_TYPE = "interaction_type";
+        String COLUMN_INTERACTION_TYPE = "interaction_type";
 
         /**
          * The interaction count for this program.
@@ -1349,14 +1349,14 @@
          * <p>Type: INTEGER (long)
          * @see #COLUMN_INTERACTION_TYPE
          */
-        public static final String COLUMN_INTERACTION_COUNT = "interaction_count";
+        String COLUMN_INTERACTION_COUNT = "interaction_count";
 
         /**
          * The author or artist of this content.
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_AUTHOR = "author";
+        String COLUMN_AUTHOR = "author";
 
         /**
          * The review rating score style used for {@link #COLUMN_REVIEW_RATING}.
@@ -1367,7 +1367,7 @@
          * <p>Type: TEXT
          * @see #COLUMN_REVIEW_RATING
          */
-        public static final String COLUMN_REVIEW_RATING_STYLE = "review_rating_style";
+        String COLUMN_REVIEW_RATING_STYLE = "review_rating_style";
 
         /**
          * The review rating score for this program.
@@ -1383,7 +1383,7 @@
          * <p>Type: TEXT
          * @see #COLUMN_REVIEW_RATING_STYLE
          */
-        public static final String COLUMN_REVIEW_RATING = "review_rating";
+        String COLUMN_REVIEW_RATING = "review_rating";
 
         /**
          * The flag indicating whether this TV program is browsable or not.
@@ -1401,7 +1401,7 @@
          *
          * <p>Type: INTEGER (boolean)
          */
-        public static final String COLUMN_BROWSABLE = "browsable";
+        String COLUMN_BROWSABLE = "browsable";
 
         /**
          * The content ID of this TV program.
@@ -1413,7 +1413,7 @@
          *
          * <p>Type: TEXT
          */
-        public static final String COLUMN_CONTENT_ID = "content_id";
+        String COLUMN_CONTENT_ID = "content_id";
 
     }
 
