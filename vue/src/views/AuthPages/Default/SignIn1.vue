<template>
  <div>
    <h1 class="mb-0">登录</h1>
    <p>请输入你的账户密码来提供服务</p>
    <tab-nav :pills="true" class="nav-fill mb-3" id="pills-tab-1">
      <tab-nav-items :active="true" id="pills-jwt-tab-fill"
         href="#pills-jwt-fill" ariaControls="pills-jwt-fill"
         role="tab" :ariaSelected="true" title="欢迎来到三刘一陈的登录界面" />
    </tab-nav>
    <tab-content id="pills-tabContent-1" class="mt-0">
      <tab-content-item :active="true" id="pills-jwt-fill" aria-labelled-by="pills-jwt-tab-fill">
          <sign-in1-form formType="jwt" email="admin@demo.com" password="admin123"></sign-in1-form>
      </tab-content-item>
    </tab-content>
  </div>
</template>

<script>
import auth0 from 'auth0-js'
import SignIn1Form from './Forms/SignIn1Form'
import constant from '../../../config/constant'

export default {
  name: 'SignIn1',
  components: { SignIn1Form },
  data: () => ({}),
  mounted () {
    const loggedIn = localStorage.getItem('access_token')
    if (loggedIn !== undefined && loggedIn !== null) {
      this.$router.push({ name: 'mini.dashboard.home-2' })
    }
  },
  methods: {
    loginOAuth0: function () {
      new auth0.WebAuth(constant.auth0Config).authorize()
    }
  }
}
</script>
