package com.example.wallpaper.data.model.home


import com.google.gson.annotations.SerializedName

class ResponsePhotos : ArrayList<ResponsePhotos.ResponsePhotosItem>(){
    data class ResponsePhotosItem(
        @SerializedName("alt_description")
        val altDescription: String?, // a person standing in the sand near some rocks
        @SerializedName("blur_hash")
        val blurHash: String?, // LJDm2GyY4oD%3rtRxts:M{Mx%gx]
        @SerializedName("breadcrumbs")
        val breadcrumbs: List<Any?>?,
        @SerializedName("color")
        val color: String?, // #402626
        @SerializedName("created_at")
        val createdAt: String?, // 2024-02-07T22:34:15Z
        @SerializedName("current_user_collections")
        val currentUserCollections: List<Any?>?,
        @SerializedName("description")
        val description: String?, // Amongst expansive red sands and spectacular sandstone rock formations |HismaDesert – NEOM, Saudi Arabia
        @SerializedName("height")
        val height: Int?, // 6336
        @SerializedName("id")
        val id: String?, // XN6Z9g3DM4A
        @SerializedName("liked_by_user")
        val likedByUser: Boolean?, // false
        @SerializedName("likes")
        val likes: Int?, // 41
        @SerializedName("links")
        val links: Links?,
        @SerializedName("promoted_at")
        val promotedAt: String?, // 2024-02-25T08:37:09Z
        @SerializedName("slug")
        val slug: String?, // a-person-standing-in-the-sand-near-some-rocks-XN6Z9g3DM4A
        @SerializedName("sponsorship")
        val sponsorship: Sponsorship?,
        @SerializedName("topic_submissions")
        val topicSubmissions: TopicSubmissions?,
        @SerializedName("updated_at")
        val updatedAt: String?, // 2024-02-25T06:55:25Z
        @SerializedName("urls")
        val urls: Urls?,
        @SerializedName("user")
        val user: User?,
        @SerializedName("width")
        val width: Int? // 9504
    ) {
        data class Links(
            @SerializedName("download")
            val download: String?, // https://unsplash.com/photos/XN6Z9g3DM4A/download?ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw
            @SerializedName("download_location")
            val downloadLocation: String?, // https://api.unsplash.com/photos/XN6Z9g3DM4A/download?ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw
            @SerializedName("html")
            val html: String?, // https://unsplash.com/photos/a-person-standing-in-the-sand-near-some-rocks-XN6Z9g3DM4A
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/photos/a-person-standing-in-the-sand-near-some-rocks-XN6Z9g3DM4A
        )
    
        data class Sponsorship(
            @SerializedName("impression_urls")
            val impressionUrls: List<String?>?,
            @SerializedName("sponsor")
            val sponsor: Sponsor?,
            @SerializedName("tagline")
            val tagline: String?, // Made to Change
            @SerializedName("tagline_url")
            val taglineUrl: String? // https://www.neom.com/en-us?utm_source=unsplash&utm_medium=referral
        ) {
            data class Sponsor(
                @SerializedName("accepted_tos")
                val acceptedTos: Boolean?, // true
                @SerializedName("bio")
                val bio: String?, // Located in the northwest of Saudi Arabia, NEOM’s diverse climate offers both sun-soaked beaches and snow-capped mountains. NEOM’s unique location will provide residents with enhanced livability while protecting 95% of the natural landscape.
                @SerializedName("first_name")
                val firstName: String?, // NEOM
                @SerializedName("for_hire")
                val forHire: Boolean?, // false
                @SerializedName("id")
                val id: String?, // mYizSrdJkkU
                @SerializedName("instagram_username")
                val instagramUsername: String?, // discoverneom
                @SerializedName("last_name")
                val lastName: Any?, // null
                @SerializedName("links")
                val links: Links?,
                @SerializedName("location")
                val location: String?, // NEOM, Saudi Arabia
                @SerializedName("name")
                val name: String?, // NEOM
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // http://www.neom.com
                @SerializedName("profile_image")
                val profileImage: ProfileImage?,
                @SerializedName("social")
                val social: Social?,
                @SerializedName("total_collections")
                val totalCollections: Int?, // 7
                @SerializedName("total_likes")
                val totalLikes: Int?, // 1
                @SerializedName("total_photos")
                val totalPhotos: Int?, // 222
                @SerializedName("total_promoted_photos")
                val totalPromotedPhotos: Int?, // 72
                @SerializedName("twitter_username")
                val twitterUsername: String?, // neom
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-02-25T07:12:08Z
                @SerializedName("username")
                val username: String? // neom
            ) {
                data class Links(
                    @SerializedName("followers")
                    val followers: String?, // https://api.unsplash.com/users/neom/followers
                    @SerializedName("following")
                    val following: String?, // https://api.unsplash.com/users/neom/following
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/@neom
                    @SerializedName("likes")
                    val likes: String?, // https://api.unsplash.com/users/neom/likes
                    @SerializedName("photos")
                    val photos: String?, // https://api.unsplash.com/users/neom/photos
                    @SerializedName("portfolio")
                    val portfolio: String?, // https://api.unsplash.com/users/neom/portfolio
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/users/neom
                )
    
                data class ProfileImage(
                    @SerializedName("large")
                    val large: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                    @SerializedName("medium")
                    val medium: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                    @SerializedName("small")
                    val small: String? // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                )
    
                data class Social(
                    @SerializedName("instagram_username")
                    val instagramUsername: String?, // discoverneom
                    @SerializedName("paypal_email")
                    val paypalEmail: Any?, // null
                    @SerializedName("portfolio_url")
                    val portfolioUrl: String?, // http://www.neom.com
                    @SerializedName("twitter_username")
                    val twitterUsername: String? // neom
                )
            }
        }
    
        data class TopicSubmissions(
            @SerializedName("film")
            val film: Film?,
            @SerializedName("street-photography")
            val streetPhotography: StreetPhotography?
        ) {
            data class Film(
                @SerializedName("status")
                val status: String? // rejected
            )
    
            data class StreetPhotography(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2024-02-25T08:24:25Z
                @SerializedName("status")
                val status: String? // approved
            )
        }
    
        data class Urls(
            @SerializedName("full")
            val full: String?, // https://images.unsplash.com/photo-1707343848610-16f9afe1ae23?crop=entropy&cs=srgb&fm=jpg&ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw&ixlib=rb-4.0.3&q=85
            @SerializedName("raw")
            val raw: String?, // https://images.unsplash.com/photo-1707343848610-16f9afe1ae23?ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw&ixlib=rb-4.0.3
            @SerializedName("regular")
            val regular: String?, // https://images.unsplash.com/photo-1707343848610-16f9afe1ae23?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw&ixlib=rb-4.0.3&q=80&w=1080
            @SerializedName("small")
            val small: String?, // https://images.unsplash.com/photo-1707343848610-16f9afe1ae23?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw&ixlib=rb-4.0.3&q=80&w=400
            @SerializedName("small_s3")
            val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1707343848610-16f9afe1ae23
            @SerializedName("thumb")
            val thumb: String? // https://images.unsplash.com/photo-1707343848610-16f9afe1ae23?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w1NzA4MjR8MXwxfGFsbHwxfHx8fHx8Mnx8MTcwODg2NDk0OXw&ixlib=rb-4.0.3&q=80&w=200
        )
    
        data class User(
            @SerializedName("accepted_tos")
            val acceptedTos: Boolean?, // true
            @SerializedName("bio")
            val bio: String?, // Located in the northwest of Saudi Arabia, NEOM’s diverse climate offers both sun-soaked beaches and snow-capped mountains. NEOM’s unique location will provide residents with enhanced livability while protecting 95% of the natural landscape.
            @SerializedName("first_name")
            val firstName: String?, // NEOM
            @SerializedName("for_hire")
            val forHire: Boolean?, // false
            @SerializedName("id")
            val id: String?, // mYizSrdJkkU
            @SerializedName("instagram_username")
            val instagramUsername: String?, // discoverneom
            @SerializedName("last_name")
            val lastName: String?, // Greenberg
            @SerializedName("links")
            val links: Links?,
            @SerializedName("location")
            val location: String?, // NEOM, Saudi Arabia
            @SerializedName("name")
            val name: String?, // NEOM
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // http://www.neom.com
            @SerializedName("profile_image")
            val profileImage: ProfileImage?,
            @SerializedName("social")
            val social: Social?,
            @SerializedName("total_collections")
            val totalCollections: Int?, // 7
            @SerializedName("total_likes")
            val totalLikes: Int?, // 1
            @SerializedName("total_photos")
            val totalPhotos: Int?, // 222
            @SerializedName("total_promoted_photos")
            val totalPromotedPhotos: Int?, // 72
            @SerializedName("twitter_username")
            val twitterUsername: String?, // neom
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-02-25T07:12:08Z
            @SerializedName("username")
            val username: String? // neom
        ) {
            data class Links(
                @SerializedName("followers")
                val followers: String?, // https://api.unsplash.com/users/neom/followers
                @SerializedName("following")
                val following: String?, // https://api.unsplash.com/users/neom/following
                @SerializedName("html")
                val html: String?, // https://unsplash.com/@neom
                @SerializedName("likes")
                val likes: String?, // https://api.unsplash.com/users/neom/likes
                @SerializedName("photos")
                val photos: String?, // https://api.unsplash.com/users/neom/photos
                @SerializedName("portfolio")
                val portfolio: String?, // https://api.unsplash.com/users/neom/portfolio
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/users/neom
            )
    
            data class ProfileImage(
                @SerializedName("large")
                val large: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                @SerializedName("medium")
                val medium: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                @SerializedName("small")
                val small: String? // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
            )
    
            data class Social(
                @SerializedName("instagram_username")
                val instagramUsername: String?, // discoverneom
                @SerializedName("paypal_email")
                val paypalEmail: Any?, // null
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // http://www.neom.com
                @SerializedName("twitter_username")
                val twitterUsername: String? // neom
            )
        }
    }
}