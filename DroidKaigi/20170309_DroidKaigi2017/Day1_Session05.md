# Day1_Session0X

## Session Info
* Title
実践アニメーション

* Place
room3

* Speaker
Naoya Yunoue

citrous

## Description

### 対象者
- 初級〜中級者
- アニメーションに苦手意識がある人

### 概要
AndroidでViewに対するアニメーションを実装する方法は様々ですが、基本は諸々のサイトで解説されています。
しかし、その多くは拡縮や移動またはそれらの組み合わせといったシンプルな実装の紹介に留められており、複雑なアニメーションを実現する際の知見はあまり見られません。
複数の要素が相対的に異なる動作をするViewなど、実践的なアニメーションをどのように実現するのか……。
本セッションではアニメーション実装へのアプローチや手法などを具体的に紹介することで、今まで何となくアニメーションにネガティブなイメージを持っていた方々に苦手意識をなくしてほしいと思っています。

## Memo
* Legacy Animation
    * Translation
      move
      `View Property animate`
    * Scale

    * Rotation

    * Alpha

* Material Design
  * 物理的な視覚効果
  * Ripple
  * シンプルなAnimationでは表現不足

* どうするか
    * AnimatorSet -> Sampleみてね
    * Android Icon Animator
        Googleの中の人が作ったGUIでアイコンアニメーションが作れる
    * ValueAnimator + CustomView
        * ValueAnimator
            指定した値を指定した時間内で変化させる

        * 全てコードで完結できる
