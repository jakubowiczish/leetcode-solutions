select w.Id from Weather w
where w.Temperature >
 (select we.Temperature from Weather we where we.RecordDate = subdate(w.RecordDate, 1))