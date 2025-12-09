insert into airline (airline_name, logo, s_airline_jp, s_airline_eg, two_letter) values 
('日本国際航空', 'jia.jpg', 'にほんこくさいこうくう', 'Japan International Air', 'JI'), 
('新東京航空', 'nta.jpg', 'しんとうきょうこうくう', 'New Tokyo Air', 'NT'), 
('オレンジエア', 'ora.jpg', 'オレンジエア', 'Orange Air', 'OR'), 
('グリーンエア', 'gra.jpg', 'グリーンエア', 'Green Air', 'GR'), 
('サクラエア', 'ska.jpg', 'サクラエア', 'Sakura Air', 'SK');

insert into timetable (airline_id, dept_time, new_dept_time, flight, dest_id, gate, remark_id) values 
(1, '07:00:00', null, 110, 1, 4, 2 ), 
(2, '08:00:00', null, 012, 2, 1, 2 ), 
(3, '09:00:00', null, 450, 1, 4, 2 ), 
(1, '10:00:00', '10:30:00', 345, 4, 4, 4 ), 
(5, '11:00:00', null, 780, 3, 1, 2 ), 
(3, '12:00:00', null, 215, 1, 4, 5 ), 
(1, '13:00:00', null, 157, 1, 8, 2 ), 
(2, '14:00:00', null, 312, 2, 1, 2 ), 
(3, '17:00:00', null, 560, 1, 4, 2 ), 
(4, '18:00:00', null, 347, 4, 9, 2 ), 
(1, '19:00:00', null, 750, 3, 1, 2 ), 
(3, '20:00:00', null, 735, 1, 4, 2 );


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
('新潟', 'Nigata', 'にいがた', 'Niigata', 3);

insert into remark (remark_jp, remark_eg) values 
( null, null ), 
('搭乗手続き中', 'Checking in'), 
('搭乗口誘導中', 'Now Boarding'), 
('遅延', 'Delayed'), 
('欠航', 'Canceled'), 
('搭乗口変更', 'Gate Changed');

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
('オセアニア', 'int');
