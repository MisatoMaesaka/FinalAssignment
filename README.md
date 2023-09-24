# 猫情報管理アプリ
RaiseTech　Javaコース　最終課題　CRUD機能をもったREST APIを作成

## API概要
猫の「名前」「毛色」「生年月日」「好物」の情報を管理するアプリです。  
CRUD機能を実装。  

## 構成要件
* Java 20.0.2
* Spring Boot 3.8
* MySQL 8.0.34
* Docker 24.0.5

## 機能一覧
| 機能 | 詳細 | URL |
| ------------ | ------------- | ------------- |
| 全件取得 | 猫一覧を返す | /cats |
| id検索 | idを指定して検索し、指定した猫を表示する | /cats/{id} |
| 新規登録 | 新しい猫を登録する | /cats |
| リストの編集 | 指定したidの内容を変更する | /cats/{id} |
| 削除 | 指定したidのデータを削除する | /cats/{id} |

## DBテーブル
データベース名：cat_database  
テーブル名：cats  
| カラム名 | 型 | 備考 |
| ---- | ---- | ---- |
| id(PRI) | INT | ID（自動生成） |
| name | VARCHAR | 猫の名前 |
| color | VARCHAR | 猫の毛色 |
| birth_date | DATE | 猫の生年月日 |
| favorite_snack | VARCHAR | 猫の好きなおやつ |

## 実行結果
