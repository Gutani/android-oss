package com.kickstarter;

import com.kickstarter.libs.CurrentUser;
import com.kickstarter.libs.KSCurrency;
import com.kickstarter.libs.Koala;
import com.kickstarter.libs.KoalaTrackingClient;
import com.kickstarter.libs.utils.ApplicationLifecycleUtil;
import com.kickstarter.services.gcm.MessageService;
import com.kickstarter.services.gcm.RegisterService;
import com.kickstarter.ui.activities.ActivityFeedActivity;
import com.kickstarter.ui.activities.CommentFeedActivity;
import com.kickstarter.ui.activities.DiscoveryActivity;
import com.kickstarter.ui.activities.HamburgerActivity;
import com.kickstarter.ui.activities.HelpActivity;
import com.kickstarter.ui.activities.LoginActivity;
import com.kickstarter.ui.activities.ManageNotificationActivity;
import com.kickstarter.ui.activities.ProjectActivity;
import com.kickstarter.ui.activities.SettingsActivity;
import com.kickstarter.ui.activities.ThanksActivity;
import com.kickstarter.ui.activities.ViewPledgeActivity;
import com.kickstarter.ui.toolbars.DiscoveryToolbar;
import com.kickstarter.ui.viewholders.CategoryPromoViewHolder;
import com.kickstarter.ui.viewholders.CommentViewHolder;
import com.kickstarter.ui.viewholders.DiscoveryFilterViewHolder;
import com.kickstarter.ui.viewholders.EmptyActivityFeedViewHolder;
import com.kickstarter.ui.viewholders.EmptyCommentFeedViewHolder;
import com.kickstarter.ui.viewholders.FriendBackingViewHolder;
import com.kickstarter.ui.viewholders.ProfileCardViewHolder;
import com.kickstarter.ui.viewholders.ProjectCardMiniViewHolder;
import com.kickstarter.ui.viewholders.ProjectCardViewHolder;
import com.kickstarter.ui.viewholders.ProjectContextViewHolder;
import com.kickstarter.ui.viewholders.ProjectSearchResultViewHolder;
import com.kickstarter.ui.viewholders.ProjectStateChangedPositiveViewHolder;
import com.kickstarter.ui.viewholders.ProjectStateChangedViewHolder;
import com.kickstarter.ui.viewholders.ProjectUpdateViewHolder;
import com.kickstarter.ui.viewholders.ProjectViewHolder;
import com.kickstarter.ui.viewholders.RewardViewHolder;
import com.kickstarter.ui.viewholders.discoverydrawer.ChildFilterViewHolder;
import com.kickstarter.ui.views.IconTextView;
import com.kickstarter.ui.views.KSWebView;
import com.kickstarter.viewmodels.ActivityFeedViewModel;
import com.kickstarter.viewmodels.CommentFeedViewModel;
import com.kickstarter.viewmodels.DiscoveryFilterViewModel;
import com.kickstarter.viewmodels.DiscoveryViewModel;
import com.kickstarter.viewmodels.FacebookConfirmationViewModel;
import com.kickstarter.viewmodels.HamburgerViewModel;
import com.kickstarter.viewmodels.LoginToutViewModel;
import com.kickstarter.viewmodels.LoginViewModel;
import com.kickstarter.viewmodels.ManageNotificationsViewModel;
import com.kickstarter.viewmodels.ProfileViewModel;
import com.kickstarter.viewmodels.ProjectViewModel;
import com.kickstarter.viewmodels.ResetPasswordViewModel;
import com.kickstarter.viewmodels.SearchViewModel;
import com.kickstarter.viewmodels.SettingsViewModel;
import com.kickstarter.viewmodels.SignupViewModel;
import com.kickstarter.viewmodels.ThanksViewModel;
import com.kickstarter.viewmodels.TwoFactorViewModel;
import com.kickstarter.viewmodels.ViewPledgeViewModel;

public interface ApplicationGraph {
  void inject(ActivityFeedActivity __);
  void inject(ActivityFeedViewModel __);
  void inject(ApplicationLifecycleUtil __);
  void inject(CategoryPromoViewHolder __);
  void inject(CommentFeedActivity __);
  void inject(CommentFeedViewModel __);
  void inject(CommentViewHolder __);
  void inject(CurrentUser __);
  void inject(Koala __);
  void inject(DiscoveryActivity __);
  void inject(DiscoveryFilterViewModel __);
  void inject(DiscoveryFilterViewHolder __);
  void inject(DiscoveryViewModel __);
  void inject(DiscoveryToolbar __);
  void inject(EmptyActivityFeedViewHolder __);
  void inject(EmptyCommentFeedViewHolder __);
  void inject(FacebookConfirmationViewModel __);
  void inject(FriendBackingViewHolder __);
  void inject(HamburgerActivity __);
  void inject(ResetPasswordViewModel __);
  void inject(ChildFilterViewHolder __);
  void inject(HamburgerViewModel __);
  void inject(HelpActivity __);
  void inject(IconTextView __);
  void inject(KoalaTrackingClient __);
  void inject(KSWebView __);
  void inject(KSApplication __);
  void inject(LoginActivity __);
  void inject(LoginViewModel __);
  void inject(LoginToutViewModel __);
  void inject(ManageNotificationActivity __);
  void inject(ManageNotificationsViewModel __);
  void inject(MessageService __);
  void inject(KSCurrency __);
  void inject(ProfileCardViewHolder __);
  void inject(ProfileViewModel __);
  void inject(ProjectContextViewHolder __);
  void inject(ProjectActivity __);
  void inject(ProjectViewModel __);
  void inject(ProjectCardViewHolder __);
  void inject(ProjectCardMiniViewHolder __);
  void inject(ProjectSearchResultViewHolder __);
  void inject(ProjectStateChangedViewHolder __);
  void inject(ProjectStateChangedPositiveViewHolder __);
  void inject(ProjectUpdateViewHolder __);
  void inject(ProjectViewHolder __);
  void inject(RegisterService __);
  void inject(RewardViewHolder __);
  void inject(SearchViewModel __);
  void inject(SettingsActivity __);
  void inject(SettingsViewModel __);
  void inject(SignupViewModel __);
  void inject(ThanksActivity __);
  void inject(ThanksViewModel __);
  void inject(TwoFactorViewModel __);
  void inject(ViewPledgeActivity __);
  void inject(ViewPledgeViewModel __);
}
