insert into airline (airline_name, logo, s_airline_jp, s_airline_eg, two_letter) values 
('ANA', 'ana.jpg', 'えーえぬえー', 'A N A', 'NH'), 
('JAL', 'jal.jpg', 'にほんこうくう', 'Japan Airlines', 'JL'), 
('スカイマーク', 'sky.jpg', 'スカイマーク', 'Skymark', 'BC'), 
('エアドゥ', 'ado.jpg', 'エアドゥ', 'Air Do', 'AD'), 
('ソラシドエア', 'snj.jpg', 'ソラシドエア', 'Solaseed Air', '6J'), 
('FDA', 'fda.jpg', 'フジドリームエアラインズ', 'Fuji Dream Airlines', 'JH'), 
('トキエア', 'tok.jpg', 'トキエア', 'Toki Air', 'BV')

insert into timetable (airline_id, dept_time, new_dept_time, dest_id, gate, remark_id) values 
(1, '07:05:00', null, 1, 4, null )

insert into dest (dest_jp, dest_eg, s_dest_jp, s_dest_eg, area_id) values 
('東京', 'Tokyo', 'とうきょう', 'Tokyo', 3), 
('札幌', 'Sapporo', 'さっぽろ', 'Sapporo', 1), 
('那覇', 'Naha', 'なは', 'Naha', 10), 
('仙台', 'Sendai', 'せんだい', 'Sendai', 2), 
('松本', 'Matsumoto', 'まつもと', 'Matsumoto', 3), 
('茨城', 'Ibaraki', 'いばらき', 'Ibaraki', 3), 
('鹿児島', 'Kagoshima', 'かごしま', 'Kagoshima', 9), 
('長崎', 'Nagasaki', 'ながさき', 'Nagasaki, ', 9), 
('下地島', 'Shimojishima', 'しもじしま', 'Shimojisima', 10), 
('青森', 'Aomori', 'あおもり', 'Aomori', 2), 
('花巻', 'Hanamaki', 'はなまき', 'Hanamaki', 2), 
('新潟', 'Nigata', 'にいがた', 'Niigata', 3)

insert into remark (remark_jp, remark_eg) values 
( null, null ), 
('搭乗口誘導中', 'Now Boarding'), 
('遅延', 'Delayed'), 
('欠航', 'Canceled'), 
('搭乗口変更', 'Gate Changed') 

insert into area (area_name, dom_or_int) values 
('北海道', 'dom'), 
('東北', 'dom'), 
('関東・甲信越', 'dom'), 
('東海', 'dom'), 
('北陸', 'dom'), 
('近畿', 'dom'), 
('中国', 'dom'), 
('四国', 'dom'), 
('九州', 'dom'), 
('沖縄', 'dom'), 
('東南・南アジア', 'int'), 
('アメリカ', 'int'), 
('ヨーロッパ', 'int'), 
('中東・アフリカ', 'int'), 
('オセアニア', 'int')
