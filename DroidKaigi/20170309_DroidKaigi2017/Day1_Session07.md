# Day1_Session07

## Session Info
* Title
全てSになる〜RxJavaとLWSを持ち込む楽しさ〜

* Place
room4

* Speaker
@ryugoo

## Description
■ 対象者
初級〜中級者向け
■ 内容
Android 7.0 SDKからStreamやOptionalなど、Java 8で導入されたAPIが一部使えるようになりました。ただし、これは応募時点(2016/10/01)ではJackコンパイラを使う場合に限られていて、実践導入はまだ先になりそうです。そこで、以前から話題となっているRxJavaや、Stream/OptionalのバックポートライブラリであるLightweight Stream APIを活用して、来たるJack時代のAndroidアプリ開発について先取りできるお話をしたいと思います。

プリミティブなAndroid SDKのAPIを使う場合と比較してどのようなメリットがあるのか、デメリットは何があるのかといった話や、RxJava/Lightweight Stream APIを実践導入して得られた知見を皆様に共有できればと思います。

特にLightweight Stream APIに関しては単なるバックポートではなく、独自の機能も持っていて、Android開発において特にFragmentを使うときにちょっと便利なユーティリティとして機能します。Android開発においてはメリットがあるライブラリだと思いますので、この知見については一番共有できればと思っています。

## Memo
* まず
`S = Stream`

* Retrolambda
* RxJava
* Lightweight Stream API

導入はLightweightStreamAPI+Retrolambda

* エラーハンドリング
    通常、購読が終了してしまう

    `Either<Throwable, String>`
    Fluent interface    流れるようなインタフェース
