

package com.rozdoum.socialcomponents.main.followPosts;

import android.view.View;

import com.rozdoum.socialcomponents.main.base.BaseView;
import com.rozdoum.socialcomponents.model.FollowingPost;

import java.util.List;



public interface FollowPostsView extends BaseView {
    void openPostDetailsActivity(String postId, View v);

    void openProfileActivity(String userId, View view);

    void onFollowingPostsLoaded(List<FollowingPost> list);

    void showLocalProgress();

    void hideLocalProgress();

    void showEmptyListMessage(boolean show);
}
